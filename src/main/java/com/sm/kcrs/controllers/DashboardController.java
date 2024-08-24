package com.sm.kcrs.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sm.kcrs.dto.DashboardResponseDto;
import com.sm.kcrs.service.DashboardService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/dashboard")
@RequiredArgsConstructor
public class DashboardController {
	
	private final DashboardService dashboardService;

	@GetMapping("/get")
	public ResponseEntity<DashboardResponseDto> dashboardData() {
		return ResponseEntity.ok(dashboardService.getDashboardData());
	}
}
