package com.ambertag.phrc.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ambertag.phrc.model.DepartmentMaster;
@Repository
public interface CommonRepository extends JpaRepository<DepartmentMaster, Long>{

	
	@Query("select td from department_master td where td.allowAdmission = 1 "
			+ "order by td.departmentNo")
	public List<DepartmentMaster> getDepartmentAdmitting();

}
