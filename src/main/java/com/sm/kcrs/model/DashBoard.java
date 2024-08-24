package com.sm.kcrs.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="dashboard")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DashBoard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer dashboardId;
	
	private Integer totalNoOfGroups;
	private Integer totalNoOfCompany;
	private Integer totalNoOfLocation;
	private Integer totalNoOfDivision;
	private Integer totalNoOfBranch;
	private Integer totalNoOfUser;

}
