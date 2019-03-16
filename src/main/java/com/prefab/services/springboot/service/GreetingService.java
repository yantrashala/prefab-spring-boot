/**
 *******************************************************
 * Copyright (c) 2019 Prefab, PublicisSapient
 * 
 * This file is part of Prefab project.
 * 
 *******************************************************
 */

package com.prefab.services.springboot.service;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.prefab.services.springboot.model.Greeting;

/**
 * Represents the Greeting Service
 * 
 */
@Service
public class GreetingService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GreetingService.class);
	
	private static final String GREET = "Welcome %s - Congratulations for using Prefab !";
	private final AtomicLong counter = new AtomicLong();

	public Greeting greet (String name) {
		
		LOGGER.info("Received request for [{}]", name);
		
		Greeting greetUser =  new Greeting(counter.incrementAndGet(),
                String.format(GREET, name.toUpperCase()));
		
		LOGGER.info("Sending : [{}]", greetUser.toString());
		
		return greetUser;
	}
	
}
