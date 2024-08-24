package com.sm.kcrs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.kcrs.model.DashBoard;

@Repository
public interface DashboardRepo extends JpaRepository<DashBoard, Integer>{

}
