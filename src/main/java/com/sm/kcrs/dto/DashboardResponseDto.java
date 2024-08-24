package com.sm.kcrs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DashboardResponseDto {

	private Integer totalNoOfGroups;
	private Integer totalNoOfCompany;
	private Integer totalNoOfLocation;
	private Integer totalNoOfDivision;
	private Integer totalNoOfBranch;
	private Integer totalNoOfUser;
	
}
