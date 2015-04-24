package com.pans;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ResourceBundle;

import javax.xml.datatype.DatatypeConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import au.com.alliedexpress.neptune.ttws_ejb.TTWS;
import au.com.alliedexpress.neptune.ttws_ejb.TnTWebService;
import au.com.alliedexpress.neptune.ttws_ejb.types.Account;
import au.com.alliedexpress.neptune.ttws_ejb.types.Client;

public class Test {

    
    //    Test
    //    Security string/key:         ee47ceab775c0756e935b13b1f7ddbcb
    //    Allied account code:       CMSELE
    //     
    //    Production
    //    Security string/key:         3NBGUWUGBD6KLEYBY1J9631JVJSNES1U
    //    Allied account code:       CMSELE

    public static void main(String[] args) throws IOException, DatatypeConfigurationException, ParseException {
        
        
        Logger logger = LoggerFactory.getLogger(Test.class);
        
        logger.info("hallo");
        logger.debug("hallo debug");
        
    }
}
