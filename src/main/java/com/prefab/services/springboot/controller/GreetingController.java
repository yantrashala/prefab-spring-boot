/**
 *******************************************************
 * Copyright (c) 2019 Prefab, PublicisSapient
 * 
 * This file is part of Prefab project.
 * 
 *******************************************************
 */

package com.prefab.services.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prefab.services.springboot.model.Greeting;
import com.prefab.services.springboot.service.GreetingService;

import io.micrometer.core.annotation.Timed;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

/**
 * Represents the Greeting Controller
 * 
 */
@RestController
@Timed("greeting")
public class GreetingController {
	
	@Autowired
	private GreetingService greetingService;

	@RequestMapping(method = RequestMethod.GET, value = "/greet")
	@ApiOperation(value = "Returns Greeting to User")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success response"),
							@ApiResponse(code = 500, message = "Internal server error") })
	public  Greeting greet( @RequestParam(value="name", required=true) String name ) {
		return greetingService.greet(name);
	}

}