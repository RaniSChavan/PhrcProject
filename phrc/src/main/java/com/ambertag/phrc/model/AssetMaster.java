package com.ambertag.phrc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class AssetMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "asset_id")
	private Long assetId;

	@Column(name = "version")
	private Long version;

	@Column(name = "department_id")
	private Long departmentId;

	@Column(name = "asset_type")
	private String assetType;

	@Column(name = "asset_name")
	private String assetName;

	@Column(name = "status_code")
	private String statusCode;

	@Temporal(TemporalType.DATE)
	@Column(name = "joiningDate")
	private Date joiningDate;

	@Column(name = "separationDate")
	private String separationDate;

	@Column(name = "is_active")
	private Boolean isActive;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateTimeStamp")
	private Date dateTimeStamp;

	@Column(name = "created_by")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "updated_by")
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "updated_date")
	private Date updatedDate;

	public AssetMaster() {
		// TODO Auto-generated constructor stub
	}

	public AssetMaster(Date dateTimeStamp) {
		super();
		this.dateTimeStamp = dateTimeStamp;
	}

	public AssetMaster(Long assetId, Long version, Long departmentId, String assetType, String assetName,
			String statusCode, Date joiningDate, String separationDate, Boolean isActive, Date dateTimeStamp,
			String createdBy, Date createdDate, String updatedBy, Date updatedDate) {
		super();
		this.assetId = assetId;
		this.version = version;
		this.departmentId = departmentId;
		this.assetType = assetType;
		this.assetName = assetName;
		this.statusCode = statusCode;
		this.joiningDate = joiningDate;
		this.separationDate = separationDate;
		this.isActive = isActive;
		this.dateTimeStamp = dateTimeStamp;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public Long getAssetId() {
		return assetId;
	}

	public void setAssetId(Long assetId) {
		this.assetId = assetId;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
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

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getSeparationDate() {
		return separationDate;
	}

	public void setSeparationDate(String separationDate) {
		this.separationDate = separationDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Date getDateTimeStamp() {
		return dateTimeStamp;
	}

	public void setDateTimeStamp(Date dateTimeStamp) {
		this.dateTimeStamp = dateTimeStamp;
	}

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

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
