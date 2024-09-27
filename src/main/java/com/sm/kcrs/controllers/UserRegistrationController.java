package com.sm.kcrs.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sm.kcrs.dto.UserRegisterDto;
import com.sm.kcrs.service.UserRegistrationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/registration")
@RequiredArgsConstructor
public class UserRegistrationController {
	
	private final UserRegistrationService userRegistrationService;
	
	@PostMapping
	public ResponseEntity<UserRegisterDto> registration(@RequestBody UserRegisterDto userRegister) {
		
		String activationURL= userRegistrationService.generateActivationLink(userRegister.getEmail());
		System.out.println("activationURL "+activationURL);
		userRegister.setMessage("user registered successfully");
		return ResponseEntity.ok(userRegister);
	}

}
