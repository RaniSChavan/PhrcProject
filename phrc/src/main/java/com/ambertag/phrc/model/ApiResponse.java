package com.ambertag.phrc.model;

import java.util.List;

public class ApiResponse {
	private String status;
	private List<Asset> data;
//	private List<PatientDetails> data1;
	private String message;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Asset> getData() {
		return data;
	}

	public void setData(List<Asset> data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

//	public List<PatientDetails> getData1() {
//		return data1;
//	}
//
//	public void setData1(List<PatientDetails> data1) {
//		this.data1 = data1;
//	}

	
	
}
