package com.ambertag.phrc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambertag.phrc.model.DepartmentMaster;
import com.ambertag.phrc.model.repository.CommonRepository;

@Service
public class CommonServiceImpl implements CommonService {
	
	@Autowired
	CommonRepository commonRepository;

	@Override
	public List<DepartmentMaster> getAdmittingDepartments() {
		// TODO Auto-generated method stub
		return commonRepository.getDepartmentAdmitting();
	}

}
