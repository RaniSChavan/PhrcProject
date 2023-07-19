package com.ambertag.phrc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Ticketdetail extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4831575108850739329L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticket_id")
	private Long ticketId;

	@Column(name = "doctor_name")
	private String doctorName;

	@Column(name = "doctor_id")
	private Integer doctorId;

	@Column(name = "department_no")
	private Long departmentNo;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	private Integer age;

	private String gender;

	@Column(name = "patient_email_id")
	private String patientEmailId;

	@Column(name = "patient_contact_no")
	private String patientContactNo;

	@Column(name = "pan_no")
	private String panNo;

    @Column(name="patient_address")
	private String patientAddress;

	@Column(name = "patient_dob")
	private Date patientDob;

	@Column(name="patient_city")
	private String patientCity;
	
	@Column(name="patient_zipcode")
	private String patientZipcode;
	
	@Column(name="patient_state_code")
	private String patientStateCode;

	@Column(name="patient_country_code")
	private String patientCountryCode;
	
	@Column(name = "patient_image")
	private String patientImage;
	
	@Column(name = "ticket_status")
	private String ticketStatus;

	@Column(name = "ticket_description")
	private String ticketDescription;

	
	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	
	
	
	@Column(name = "senior_doctor")
	private String seniorDoctor;
	@Column(name = "junior_doctor")
	private String juniorDoctor;
	@Column(name = "selectBed")
	private String selectBed;
	@Column(name = "nurse")
	private String nurse;
	@Column(name = "common_asset")
	private String commonAsset;


	public String getSeniorDoctor() {
		return seniorDoctor;
	}

	public void setSeniorDoctor(String seniorDoctor) {
		this.seniorDoctor = seniorDoctor;
	}

	public String getJuniorDoctor() {
		return juniorDoctor;
	}

	public void setJuniorDoctor(String juniorDoctor) {
		this.juniorDoctor = juniorDoctor;
	}

	public String getSelectBed() {
		return selectBed;
	}

	public void setSelectBed(String selectBed) {
		this.selectBed = selectBed;
	}

	public String getNurse() {
		return nurse;
	}

	public void setNurse(String nurse) {
		this.nurse = nurse;
	}

	public String getCommonAsset() {
		return commonAsset;
	}

	public void setCommonAsset(String commonAsset) {
		this.commonAsset = commonAsset;
	}

	
		
}
