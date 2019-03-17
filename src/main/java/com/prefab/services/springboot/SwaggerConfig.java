/**
 *******************************************************
 * Copyright (c) 2019 Prefab, PublicisSapient
 * 
 * This file is part of Prefab project.
 * 
 *******************************************************
 */

package com.prefab.services.springboot;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.prefab.services.springboot.controller"))             
          .paths(PathSelectors.any())                          
          .build()
          .apiInfo(getApiInfo());                                           
    }

	private ApiInfo getApiInfo() {
		 return new ApiInfo(
				 "Prefab Greeting API",
				 "This API is to greet the user visiting Prefab Greeting Service", 
				 "1.0", 
				 null, 
				 new Contact("Publicis Sapient", "www.publicissapient.com", null), 
				 null, 
				 null, 
				 Collections.emptyList());
	}
}
