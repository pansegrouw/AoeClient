package com.pans;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import au.com.alliedexpress.neptune.ttws_ejb.TTWS;
import au.com.alliedexpress.neptune.ttws_ejb.TnTWebService;
import au.com.alliedexpress.neptune.ttws_ejb.types.Job;
import au.com.alliedexpress.neptune.ttws_ejb.types.JobError;

public class Monitor implements Runnable {

	private Properties props;
	Logger LOG = LoggerFactory.getLogger(Monitor.class);

	public Monitor(Properties props) {
		this.props = props;
	}

	public void run() {

		File inputFolder = new File(props.getProperty("monitor.location"));
		File processedFolder = new File(props.getProperty("processed.location"));
		File resultFolder = new File(props.getProperty("result.location"));
		if (!processedFolder.exists()) {
			processedFolder.mkdirs();
		}
		if (!resultFolder.exists()) {
			resultFolder.mkdirs();
		}

		LOG.info("checking [{}]", inputFolder);
		File[] listOfFiles = inputFolder.listFiles();
		LOG.debug("[{}] files found to process", listOfFiles.length);

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				String resultFileName = props.getProperty("result.location")
						+ "/" + listOfFiles[i].getName();
				List<String> outcome = new ArrayList<String>();
				LOG.info("processing file " + listOfFiles[i].getName());

				try {
					TnTWebService xxx = new TnTWebService();
					LOG.debug("web service created");
					TTWS ttWs = xxx.getTTWSPort();

					BindingProvider bp = (BindingProvider) ttWs;
					Map<String, Object> requestContext = bp.getRequestContext();
					requestContext.put("com.sun.xml.ws.connect.timeout", 30000);
					requestContext.put("com.sun.xml.ws.request.timeout", 30000);

					LOG.debug("web port opened");
					JobReader jobReader = new JobReader();

					Job job = jobReader.readJob(listOfFiles[i], ttWs);
					LOG.debug("job created from file " + job);
					String key = jobReader.getKey();

					LOG.debug("validating booking");
					job = ttWs.validateBooking(key, job);
					LOG.debug("validation done");
					if (job.getJobErrors().size() == 0
							|| job.getJobErrors().get(0) == null) {
						LOG.debug("job valid , saving");
						ttWs.savePendingJob(key, job);
						LOG.debug("job saved");
						outcome.add("result = success");
						writeResult(resultFileName, outcome);
					} else {
						// Job not validated
						LOG.debug("job not valid");
						outcome.add("result = joberror");
						for (JobError je : job.getJobErrors()) {
							if (je != null) {
								outcome.add(je.getFieldName() + ":"
										+ je.getFieldData() + ":"
										+ je.getErrorMsg());
							}
						}
						writeResult(resultFileName, outcome);
					}

					LOG.debug("file processed. moving to [{}]",
							props.getProperty("processed.location"));
					listOfFiles[i].renameTo(new File(props
							.getProperty("processed.location")
							+ "/"
							+ listOfFiles[i].getName()
							+ System.currentTimeMillis()));

				} catch (WebServiceException | IOException | DatatypeConfigurationException | ParseException  e) {
					LOG.error("Processing exception", e);
				}

			}
		}


	}

//	private void writeExceptionResult(String fileName, Exception e) {
//		StringWriter sw = new StringWriter();
//		PrintWriter pw = new PrintWriter(sw);
//		e.printStackTrace(pw);
//		String string = sw.toString();
//		PrintWriter writer;
//		try {
//			writer = new PrintWriter(fileName);
//			writer.println("result = exception");
//			writer.println(string);
//			writer.close();
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//		}
//	}

	private void writeResult(String fileName, List<String> result) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(fileName);
			for (String r : result) {
				writer.println(r);
			}
			writer.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}

}
