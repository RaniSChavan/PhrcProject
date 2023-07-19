package com.ambertag.phrc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambertag.phrc.model.PatientDetails;
import com.ambertag.phrc.model.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	private PatientRepository patientRepository;
	
	@Override
	public List<PatientDetails> getAllPatient() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

}
