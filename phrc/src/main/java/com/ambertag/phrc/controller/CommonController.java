package com.ambertag.phrc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ambertag.phrc.model.Transaction;
import com.ambertag.phrc.service.CommonService;
import com.ambertag.phrc.service.TransactionService;

@RestController
@RequestMapping("/phrc/api/v1")
public class CommonController {
	
	@Autowired
	CommonService commonService;
	
	@Autowired
	TransactionService transactionService;
	
	@GetMapping("/getAdmittingDepartments")
	public ResponseEntity<Object> getAdmittingDepartments(){
		return new ResponseEntity<Object>(commonService.getAdmittingDepartments(), HttpStatus.OK);
	}
	
	@GetMapping("/main/getPatientAssets/{admissionId}")
	public ResponseEntity<Transaction> getPatientAssets(@PathVariable("admissionId") long admissionId){
		return new ResponseEntity<Transaction>(transactionService.getPatientAsset(admissionId), HttpStatus.OK);
	}

} 
