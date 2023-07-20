package com.ambertag.phrc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "transaction")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transId;
	private long admissionId;
	@Column(name = "session_completed")
	private boolean sessionCompleted;
	private String assetType;
	private String assetName;
	private int departmentId;
	private String departmentName;
	private String statusCode;
	private String assetShortDescription;
	private Date createdDate;

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(long transId, long admissionId, boolean sessionCompleted, String assetType, String assetName,
			int departmentId, String departmentName, String statusCode, String assetShortDescription,
			Date createdDate) {
		super();
		this.transId = transId;
		this.admissionId = admissionId;
		this.sessionCompleted = sessionCompleted;
		this.assetType = assetType;
		this.assetName = assetName;
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.statusCode = statusCode;
		this.assetShortDescription = assetShortDescription;
		this.createdDate = createdDate;
	}

	public long getTransId() {
		return transId;
	}

	public void setTransId(long transId) {
		this.transId = transId;
	}

	public long getAdmissionId() {
		return admissionId;
	}

	public void setAdmissionId(long admissionId) {
		this.admissionId = admissionId;
	}

	public boolean isSessionCompleted() {
		return sessionCompleted;
	}

	public void setSessionCompleted(boolean sessionCompleted) {
		this.sessionCompleted = sessionCompleted;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getAssetShortDescription() {
		return assetShortDescription;
	}

	public void setAssetShortDescription(String assetShortDescription) {
		this.assetShortDescription = assetShortDescription;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
