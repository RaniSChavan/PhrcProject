package com.ambertag.phrc.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@MappedSuperclass
@XmlAccessorType(XmlAccessType.NONE)

public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4278033819269398872L;

	@SuppressWarnings("rawtypes")
	public static ThreadLocal currentUser = new ThreadLocal();

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	@Temporal(TemporalType.DATE)
	private Date createdDate = new Date();

	@Column(name = "updated_by")
	private String updatedBy;

	@Column(name = "updated_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp updatedDate;

	@Column(name = "version")
	private Integer version = 0;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@PrePersist
	public void createAuditInfo() {
		setCreatedDate(Calendar.getInstance().getTime());
		setUpdatedDate(new Timestamp(Calendar.getInstance().getTimeInMillis()));
	}
	
	public void updateAuditInfo() {
		setUpdatedDate(new Timestamp(Calendar.getInstance().getTimeInMillis()));
	}

}
