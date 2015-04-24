package com.pans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import au.com.alliedexpress.neptune.ttws_ejb.TTWS;
import au.com.alliedexpress.neptune.ttws_ejb.types.Account;
import au.com.alliedexpress.neptune.ttws_ejb.types.GeographicAddress;
import au.com.alliedexpress.neptune.ttws_ejb.types.Item;
import au.com.alliedexpress.neptune.ttws_ejb.types.Job;
import au.com.alliedexpress.neptune.ttws_ejb.types.JobStop;

public class JobReader {

    private String key = null;
    Logger LOG = LoggerFactory.getLogger(JobReader.class);
    
    public Job readJob(File file, TTWS ttWs) throws IOException, DatatypeConfigurationException, ParseException {
        LOG.debug("reading job file");
        List<String> data = readFileLines(file);
        return processData(data, ttWs);
    }

    private List<String> readFileLines(File file) throws IOException {
        List<String> lines = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        try {
            String line = br.readLine();
            

            while (line != null) {
                lines.add(line);
                line = br.readLine();
            }
        } finally {
            br.close();
        }

        return lines;
    }

    private Job processData(List<String> data, TTWS ttWs) throws DatatypeConfigurationException, ParseException {
        
        Account account = createAccount(data , ttWs);
        LOG.debug("account created [{}]" , account.toString());
        
        GeographicAddress pickupAddress = createPickupAddress(data);
        LOG.debug("pickupAddress created [{}]" , pickupAddress.toString());

        GeographicAddress deliveryAddress = createDeliveryAddress(data);
        LOG.debug("deliveryAddress created [{}]" , deliveryAddress.toString());

        JobStop pickupStop = createPickupStop(data, pickupAddress);
        LOG.debug("pickupStop created [{}]" , pickupStop.toString());

        JobStop deliveryStop = createDeliveryStop(data, deliveryAddress);
        LOG.debug("deliveryStop created [{}]" , deliveryStop.toString());

        Item jobItem = createJobItem(data);
        LOG.debug("jobItem created [{}]" , jobItem.toString());
        
        Job job = createJob(data, account, jobItem, pickupStop, deliveryStop);
        LOG.debug("job created [{}]" , job.toString());
        
        return job;

    }

    private Account createAccount(List<String> data, TTWS ttWs) {
        String raw = data.get(0);
        List<String> accDetails = Arrays.asList(raw.split(","));
        key = accDetails.get(0);
        return ttWs.getAccountDefaults(accDetails.get(0), accDetails.get(1), accDetails.get(2), accDetails.get(3));
    }

    //    1  [pickup address 1]                   123 Here Street
    //    2  [pickup suburb]                              SALISBURY
    //    3  [pickup state]                               QLD
    //    4  [pickup post code]                   4107
    private GeographicAddress createPickupAddress(List<String> data) {
        GeographicAddress pickupAddress = new GeographicAddress();
        pickupAddress.setAddress1(data.get(1));
        pickupAddress.setSuburb(data.get(2));
        pickupAddress.setState(data.get(3));
        pickupAddress.setPostCode(data.get(4));

        return pickupAddress;
    }

    //    5  [delivery address 1]             456 There Street
    //    6  [delivery suburb]            PARRAMATTA
    //    7  [delivery state]                     NSW
    //    8  [delivery post code]         2150
    private GeographicAddress createDeliveryAddress(List<String> data) {
        GeographicAddress deliveryAddress = new GeographicAddress();
        deliveryAddress.setAddress1(data.get(5));
        deliveryAddress.setSuburb(data.get(6));
        deliveryAddress.setState(data.get(7));
        deliveryAddress.setPostCode(data.get(8));
        return deliveryAddress;
    }

    //    9  [pickupStop comp name]   Senders R Us
    //    10 [pickupStop contact]         Mr. Sender
    //    11 [pickupStop phone num]       07 1324 5678
    //    12 [pickupStop type]            P
    //    13 [pickupStop number]          1
    private JobStop createPickupStop(List<String> data, GeographicAddress pickupAddr) {
        JobStop pickupStop = new JobStop();
        pickupStop.setCompanyName(data.get(9));
        pickupStop.setContact(data.get(10));
        pickupStop.setPhoneNumber(data.get(11));
        pickupStop.setStopType(data.get(12));
        pickupStop.setStopNumber(Integer.parseInt(data.get(13)));
        pickupStop.setGeographicAddress(pickupAddr);
        return pickupStop;
    }

    //    14 [deliveryStop comp name] Receivers R Us
    //    15 [deliveryStop contact]       Mrs Reciever
    //    16 [deliveryStop phone num]     02 9876 5432
    //    17 [deliveryStop type]          D
    //    18 [deliveryStop number]        2
    private JobStop createDeliveryStop(List<String> data, GeographicAddress deliveryAddress) {
        JobStop deliveryStop = new JobStop();
        deliveryStop.setCompanyName(data.get(14));
        deliveryStop.setContact(data.get(15));
        deliveryStop.setPhoneNumber(data.get(16));
        deliveryStop.setStopType(data.get(17));
        deliveryStop.setStopNumber(Integer.parseInt(data.get(18)));
        deliveryStop.setGeographicAddress(deliveryAddress);
        return deliveryStop;
    }

    //    19 [jobItem dangerous]          false/true
    //    20 [jobItem length]                     50
    //    21 [jobItem width]                      50
    //    22 [jobItem height]                     50
    //    23 [jobItem volume]                     0.125
    //    24 [jobItem weight]                     20
    //    25 [jobItem item count]         1
    private Item createJobItem(List<String> data) {
        Item jobItem1 = new Item();
        jobItem1.setDangerous(Boolean.parseBoolean(data.get(19)));
        jobItem1.setLength(Double.parseDouble(data.get(20)));
        jobItem1.setWidth(Double.parseDouble(data.get(21)));
        jobItem1.setHeight(Double.parseDouble(data.get(22)));
        jobItem1.setVolume(Double.parseDouble(data.get(23)));
        jobItem1.setWeight(Double.parseDouble(data.get(24)));
        jobItem1.setItemCount(Integer.parseInt(data.get(25)));
        return jobItem1;
    }

    private Job createJob(List<String> data , Account account , Item item , JobStop pickupStop , JobStop deliveryStop) throws DatatypeConfigurationException, ParseException {

        

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(data.get(27));
        GregorianCalendar gCal = new GregorianCalendar();
        gCal.setTime(date);
        
        
        XMLGregorianCalendar cal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);
        
        Job job = new Job();
        job.setAccount(account);
        job.setInstructions(data.get(28)); // Optional
        job.setItemCount(1);
        job.setWeight(item.getWeight());
        job.setVolume(item.getVolume());
        job.getItems().add(item);
        job.getJobStops().add(pickupStop);
        job.getJobStops().add(deliveryStop);
        job.setServiceLevel(data.get(29));
        job.getReferenceNumbers().add(data.get(26));
        job.setBookedBy(data.get(30));
        job.setReadyDate(cal);
        
        return job;

    }

    public String getKey() {
        return key;
    }
}
