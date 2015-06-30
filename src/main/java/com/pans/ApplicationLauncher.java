/**
 * 
 */
package com.pans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author pans
 * 
 */
public class ApplicationLauncher {

    
    public static String HOST = null;
    
    /**
     * @param args
     * @throws IOException 
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        
//        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "DEBUG");
//        System.setProperty(org.slf4j.impl.SimpleLogger.LOG_FILE_KEY, "aoe.app.log");
//        
        Logger logger = LoggerFactory.getLogger(ApplicationLauncher.class);
        int interval = 60;
        
        if(args == null || args.length ==0) {
            logger.error("Properties file needs to be spesified");
            System.exit(0);
        }
        
        
        logger.info("Starting app with properties file " + args[0]);

        Properties props = new Properties();
        props.load(new BufferedReader(new FileReader(args[0])));

        HOST = props.getProperty("host");
        String timerInterval = props.getProperty("timer.interval.seconds");
        
        
        if(HOST == null || HOST.equals("")) {
            logger.error("host property not set in properties file");
            System.exit(0);
        }
        
        if(timerInterval != null) {
            try {
            interval = Integer.parseInt(timerInterval);
            } catch(Exception ex) {
                
            }
        }
        
        
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        logger.info("creating task. Scheduling montor to [{}] seconds" , interval);
        Runnable task = new Monitor(props);
        logger.info("sheduling task");
        executor.scheduleAtFixedRate(task, 5, interval, TimeUnit.SECONDS);
        logger.info("done");
    }

}
