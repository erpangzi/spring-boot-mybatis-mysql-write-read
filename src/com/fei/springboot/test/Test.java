package com.fei.springboot.test;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.management.snmp.util.MibLogger;

import java.util.ArrayList;

public class Test {

    private static Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        logger.info(String.valueOf(objects!=null));
        logger.info(String.valueOf(objects.size()));
    }

}
