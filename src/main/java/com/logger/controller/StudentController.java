package com.logger.controller;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

public class StudentController {

	private static Logger logger = LoggerFactory.getLogger(WelcomeController.class); 
	@GetMapping("/welcome")
	public String getAlllocation() {
		
		String sMsg="Start point of getAllLocation()";
	    System.out.println(LocalDate.now()+""+sMsg);
	 
	    logger.info(sMsg);
		String eMsg="Exit point of getAllLocation()";
		System.out.println(LocalDate.now()+""+sMsg);
		logger.info(eMsg);
		return "Welcoome to Bikkad IT";
		
	}
	
}
