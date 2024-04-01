package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyTest3 {
	
	static final Logger log = LogManager.getLogger(MyTest3.class);
	public static void main(String[] args) {
		
		
		log.info("This is information message");
		log.debug("debug message");
		log.error("This is error message");
		log.fatal("This is fatel error");
	}
	
}
