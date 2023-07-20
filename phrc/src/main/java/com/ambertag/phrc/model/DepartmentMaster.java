package com.ambertag.phrc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "department_master")
public class DepartmentMaster implements Serializable {

	@Id
	@Column(name = "department_no")
	private long departmentNo;

	@Column(name = "department_name")
	private String departmentName;

	@Column(name = "allow_admission")
	private Byte allowAdmission;

	@Column(name = "is_active")
	private boolean isActive;

	public DepartmentMaster() {
		// TODO Auto-generated constructor stub
	}

	public DepartmentMaster(long departmentNo, String departmentName, Byte allowAdmission, boolean isActive) {
		super();
		this.departmentNo = departmentNo;
		this.departmentName = departmentName;
		this.allowAdmission = allowAdmission;
		this.isActive = isActive;
	}

	public long getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(long departmentNo) {
		this.departmentNo = departmentNo;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Byte getAllowAdmission() {
		return allowAdmission;
	}

	public void setAllowAdmission(Byte allowAdmission) {
		this.allowAdmission = allowAdmission;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
