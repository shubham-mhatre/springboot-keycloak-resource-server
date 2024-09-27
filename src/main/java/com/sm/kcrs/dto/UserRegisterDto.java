package com.sm.kcrs.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties
public class UserRegisterDto {

	private String email;
	private String firstName;
	private String lastName;
	
	private String message;
}
