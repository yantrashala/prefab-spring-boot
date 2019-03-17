/**
 *******************************************************
 * Copyright (c) 2019 Prefab, PublicisSapient
 * 
 * This file is part of Prefab project.
 * 
 *******************************************************
 */

package com.prefab.services.springboot.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Class Represeting the Greeting for a user")
public class Greeting {

	@ApiModelProperty(notes = "Visitor id of user", example = "1", required = true, position = 0)
	private final long id;
	
	@ApiModelProperty(notes = "Greeting message for the user", example = "Welcome John", required = true, position = 1)
    private final String message;

 	public Greeting(long id, String message) {
		super();
		this.id = id;
		this.message = message;
	}

	public long getId() {
		return id;
	}


	public String getMessage() {
		return message;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Greeting other = (Greeting) obj;
		if (id != other.id)
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Greeting [id=" + id + ", message=" + message + "]";
	}
    
    
}
