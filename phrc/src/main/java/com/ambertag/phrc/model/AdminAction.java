package com.ambertag.phrc.model;

import javax.persistence.Column;

import lombok.Data;

public class AdminAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8904837627955592321L;
	private Long ticketId;
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

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}

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

	public AdminAction(Long ticketId, String seniorDoctor, String juniorDoctor, String selectBed, String nurse,
			String commonAsset) {
		super();
		this.ticketId = ticketId;
		this.seniorDoctor = seniorDoctor;
		this.juniorDoctor = juniorDoctor;
		this.selectBed = selectBed;
		this.nurse = nurse;
		this.commonAsset = commonAsset;
	}

	public AdminAction(Ticketdetail updaTicketdetail) {
		super();
	}

}
