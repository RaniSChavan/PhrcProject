package com.ambertag.phrc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AssetTransactionsId implements Serializable {

	@Column(name = "assetNo")
	private String assetNo;

	@Column(name = "deptNo")
	private Integer deptNo;

	@Column(name = "assetAttributeId")
	private Integer assetAttributeId;

	@Column(name = "attributeStatus")
	private Integer attributeStatus;

	@Column(name = "dateTimeStamp")
	private Date dateTimeStamp;

	public AssetTransactionsId() {
		// TODO Auto-generated constructor stub
	}

	public AssetTransactionsId(Date dateTimeStamp) {
		super();
		this.dateTimeStamp = dateTimeStamp;
	}

	public AssetTransactionsId(String assetNo, Integer deptNo, Integer assetAttributeId, Integer attributeStatus,
			Date dateTimeStamp) {
//	super();
		this.assetNo = assetNo;
		this.deptNo = deptNo;
		this.assetAttributeId = assetAttributeId;
		this.attributeStatus = attributeStatus;
		this.dateTimeStamp = dateTimeStamp;
	}

	public String getAssetNo() {
		return assetNo;
	}

	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public Integer getAssetAttributeId() {
		return assetAttributeId;
	}

	public void setAssetAttributeId(Integer assetAttributeId) {
		this.assetAttributeId = assetAttributeId;
	}

	public Integer getAttributeStatus() {
		return attributeStatus;
	}

	public void setAttributeStatus(Integer attributeStatus) {
		this.attributeStatus = attributeStatus;
	}

	public Date getDateTimeStamp() {
		return dateTimeStamp;
	}

	public void setDateTimeStamp(Date dateTimeStamp) {
		this.dateTimeStamp = dateTimeStamp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AssetTransactionsId))
			return false;
		AssetTransactionsId castOther = (AssetTransactionsId) other;

		return ((this.getAssetNo() == castOther.getAssetNo()) || (this.getAssetNo() != null
				&& castOther.getAssetNo() != null && this.getAssetNo().equals(castOther.getAssetNo())))
				&& ((this.getDeptNo() == castOther.getDeptNo()) || (this.getDeptNo() != null
						&& castOther.getDeptNo() != null && this.getDeptNo().equals(castOther.getDeptNo())))
				&& ((this.getAssetAttributeId() == castOther.getAssetAttributeId())
						|| (this.getAssetAttributeId() != null && castOther.getAssetAttributeId() != null
								&& this.getAssetAttributeId().equals(castOther.getAssetAttributeId())))
				&& ((this.getAttributeStatus() == castOther.getAttributeStatus())
						|| (this.getAttributeStatus() != null && castOther.getAttributeStatus() != null
								&& this.getAttributeStatus().equals(castOther.getAttributeStatus())))
				&& ((this.getDateTimeStamp() == castOther.getDateTimeStamp())
						|| (this.getDateTimeStamp() != null && castOther.getDateTimeStamp() != null
								&& this.getDateTimeStamp().equals(castOther.getDateTimeStamp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAssetNo() == null ? 0 : this.getAssetNo().hashCode());
		result = 37 * result + (getDeptNo() == null ? 0 : this.getDeptNo().hashCode());
		result = 37 * result + (getAssetAttributeId() == null ? 0 : this.getAssetAttributeId().hashCode());
		result = 37 * result + (getAttributeStatus() == null ? 0 : this.getAttributeStatus().hashCode());
		result = 37 * result + (getDateTimeStamp() == null ? 0 : this.getDateTimeStamp().hashCode());
		return result;
	}
}
