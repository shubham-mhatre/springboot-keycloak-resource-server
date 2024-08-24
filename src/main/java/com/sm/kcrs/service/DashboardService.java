package com.sm.kcrs.service;

import org.springframework.stereotype.Service;

import com.sm.kcrs.dto.DashboardResponseDto;
import com.sm.kcrs.model.DashBoard;
import com.sm.kcrs.repo.DashboardRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DashboardService {

	private final DashboardRepo dashboardRepo;

	public DashboardResponseDto getDashboardData() {
		DashBoard dashboardData= dashboardRepo.findAll().get(0);

		DashboardResponseDto response=new DashboardResponseDto();
		response.setTotalNoOfGroups(dashboardData.getTotalNoOfGroups());
		response.setTotalNoOfCompany(dashboardData.getTotalNoOfCompany());
		response.setTotalNoOfLocation(dashboardData.getTotalNoOfLocation());
		response.setTotalNoOfDivision(dashboardData.getTotalNoOfDivision());
		response.setTotalNoOfBranch(dashboardData.getTotalNoOfBranch());
		response.setTotalNoOfUser(dashboardData.getTotalNoOfUser());
		
		return response;
	}
}
