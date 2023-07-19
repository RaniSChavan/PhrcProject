package com.ambertag.phrc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ambertag.phrc.model.ApiResponse;
import com.ambertag.phrc.model.Asset;
import com.ambertag.phrc.model.PatientDetails;
import com.ambertag.phrc.service.PatientService;

@RestController
@RequestMapping("/phrc/api/v1/main")
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	
	/*
	 * @GetMapping("/getAllPatients") public ApiResponse getAllPatient() {
	 * ApiResponse response = new ApiResponse(); response.setStatus("success");
	 * 
	 * 
	 * List<PatientDetails> patient=patientService.getAllPatient();
	 * response.setData1(patient);
	 * 
	 * response.setMessage("success"); return response; }
	 */	
	@GetMapping("/getAllPatients")
	public List<PatientDetails> getAllPatient(){
		return patientService.getAllPatient();
	}
}
