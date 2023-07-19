//package com.ambertag.phrc.model;
//
//import java.io.Serializable;
//import java.util.Date;
//
//import javax.persistence.Column;
//
//public class PatientActivitiesId implements Serializable {
//	@Column(name = "deptNo")
//	private Integer deptNo;
//	
//	@Column(name = "PatientId")
//	private Integer patientId;
//	
//	@Column(name = "bedNo")
//	private String bedNo;
//	
//	@Column(name = "principalIssue")
//	private Integer principalIssue;
//	
//	@Column(name = "mainSubIssue")
//	private Integer mainSubIssue;
//	
//	@Column(name = "principalIssueModifier")
//	private String principalIssueModifier;
//	
//	@Column(name = "mainSubIssueModifier")
//	private String mainSubIssueModifier;
//	
//	@Column(name = "nursesComment")
//	private String nursesComment;
//	
//	@Column(name = "admittedUnder")
//	private Integer admittedUnder;
//	
//	@Column(name = "assignedJrDoctor")
//	private Integer assignedJrDoctor;
//	
//	@Column(name = "patinetState")
//	private String patinetState;
//	
//	@Column(name = "patientStatus")
//	private String patientStatus;
//	
//	@Column(name = "patientNeedsId")
//	private Integer patientNeedsId;
//	
//	@Column(name = "dateTimeStamp")
//	private Date dateTimeStamp;
//
//	public Integer getDeptNo() {
//		return deptNo;
//	}
//
//	public void setDeptNo(Integer deptNo) {
//		this.deptNo = deptNo;
//	}
//
//	public Integer getPatientId() {
//		return patientId;
//	}
//
//	public void setPatientId(Integer patientId) {
//		this.patientId = patientId;
//	}
//
//	public String getBedNo() {
//		return bedNo;
//	}
//
//	public void setBedNo(String bedNo) {
//		this.bedNo = bedNo;
//	}
//
//	public Integer getPrincipalIssue() {
//		return principalIssue;
//	}
//
//	public void setPrincipalIssue(Integer principalIssue) {
//		this.principalIssue = principalIssue;
//	}
//
//	public Integer getMainSubIssue() {
//		return mainSubIssue;
//	}
//
//	public void setMainSubIssue(Integer mainSubIssue) {
//		this.mainSubIssue = mainSubIssue;
//	}
//
//	public String getPrincipalIssueModifier() {
//		return principalIssueModifier;
//	}
//
//	public void setPrincipalIssueModifier(String principalIssueModifier) {
//		this.principalIssueModifier = principalIssueModifier;
//	}
//
//	public String getMainSubIssueModifier() {
//		return mainSubIssueModifier;
//	}
//
//	public void setMainSubIssueModifier(String mainSubIssueModifier) {
//		this.mainSubIssueModifier = mainSubIssueModifier;
//	}
//
//	public String getNursesComment() {
//		return nursesComment;
//	}
//
//	public void setNursesComment(String nursesComment) {
//		this.nursesComment = nursesComment;
//	}
//
//	public Integer getAdmittedUnder() {
//		return admittedUnder;
//	}
//
//	public void setAdmittedUnder(Integer admittedUnder) {
//		this.admittedUnder = admittedUnder;
//	}
//
//	public Integer getAssignedJrDoctor() {
//		return assignedJrDoctor;
//	}
//
//	public void setAssignedJrDoctor(Integer assignedJrDoctor) {
//		this.assignedJrDoctor = assignedJrDoctor;
//	}
//
//	public String getPatinetState() {
//		return patinetState;
//	}
//
//	public void setPatinetState(String patinetState) {
//		this.patinetState = patinetState;
//	}
//
//	public String getPatientStatus() {
//		return patientStatus;
//	}
//
//	public void setPatientStatus(String patientStatus) {
//		this.patientStatus = patientStatus;
//	}
//
//	public Integer getPatientNeedsId() {
//		return patientNeedsId;
//	}
//
//	public void setPatientNeedsId(Integer patientNeedsId) {
//		this.patientNeedsId = patientNeedsId;
//	}
//
//	public Date getDateTimeStamp() {
//		return dateTimeStamp;
//	}
//
//	public void setDateTimeStamp(Date dateTimeStamp) {
//		this.dateTimeStamp = dateTimeStamp;
//	}
//	public boolean equals(Object other) {
//		if ((this == other))
//			return true;
//		if ((other == null))
//			return false;
//		if (!(other instanceof PatientActivitiesId))
//			return false;
//		PatientActivitiesId castOther = (PatientActivitiesId) other;
//
//		return ((this.getDeptNo() == castOther.getDeptNo()) || (this.getDeptNo() != null
//				&& castOther.getDeptNo() != null && this.getDeptNo().equals(castOther.getDeptNo())))
//				&& ((this.getPatientId() == castOther.getPatientId()) || (this.getPatientId() != null
//						&& castOther.getPatientId() != null && this.getPatientId().equals(castOther.getPatientId())))
//				&& ((this.getBedNo() == castOther.getBedNo()) || (this.getBedNo() != null
//						&& castOther.getBedNo() != null && this.getBedNo().equals(castOther.getBedNo())))
//				&& ((this.getPrincipalIssue() == castOther.getPrincipalIssue())
//						|| (this.getPrincipalIssue() != null && castOther.getPrincipalIssue() != null
//								&& this.getPrincipalIssue().equals(castOther.getPrincipalIssue())))
//				&& ((this.getMainSubIssue() == castOther.getMainSubIssue())
//						|| (this.getMainSubIssue() != null && castOther.getMainSubIssue() != null
//								&& this.getMainSubIssue().equals(castOther.getMainSubIssue())))
//				&& ((this.getPrincipalIssueModifier() == castOther.getPrincipalIssueModifier())
//						|| (this.getPrincipalIssueModifier() != null && castOther.getPrincipalIssueModifier() != null
//								&& this.getPrincipalIssueModifier().equals(castOther.getPrincipalIssueModifier())))
//				&& ((this.getMainSubIssueModifier() == castOther.getMainSubIssueModifier())
//						|| (this.getMainSubIssueModifier() != null && castOther.getMainSubIssueModifier() != null
//								&& this.getMainSubIssueModifier().equals(castOther.getMainSubIssueModifier())))
//				&& ((this.getNursesComment() == castOther.getNursesComment())
//						|| (this.getNursesComment() != null && castOther.getNursesComment() != null
//								&& this.getNursesComment().equals(castOther.getNursesComment())))
//				&& ((this.getAdmittedUnder() == castOther.getAdmittedUnder())
//						|| (this.getAdmittedUnder() != null && castOther.getAdmittedUnder() != null
//								&& this.getAdmittedUnder().equals(castOther.getAdmittedUnder())))
//				&& ((this.getAssignedJrDoctor() == castOther.getAssignedJrDoctor())
//						|| (this.getAssignedJrDoctor() != null && castOther.getAssignedJrDoctor() != null
//								&& this.getAssignedJrDoctor().equals(castOther.getAssignedJrDoctor())))
//				&& ((this.getPatinetState() == castOther.getPatinetState())
//						|| (this.getPatinetState() != null && castOther.getPatinetState() != null
//								&& this.getPatinetState().equals(castOther.getPatinetState())))
//				&& ((this.getPatientStatus() == castOther.getPatientStatus())
//						|| (this.getPatientStatus() != null && castOther.getPatientStatus() != null
//								&& this.getPatientStatus().equals(castOther.getPatientStatus())))
//				&& ((this.getPatientNeedsId() == castOther.getPatientNeedsId())
//						|| (this.getPatientNeedsId() != null && castOther.getPatientNeedsId() != null
//								&& this.getPatientNeedsId().equals(castOther.getPatientNeedsId())))
//				&& ((this.getDateTimeStamp() == castOther.getDateTimeStamp())
//						|| (this.getDateTimeStamp() != null && castOther.getDateTimeStamp() != null
//								&& this.getDateTimeStamp().equals(castOther.getDateTimeStamp())));
//	}
//
//	public int hashCode() {
//		int result = 17;
//
//		result = 37 * result + (getDeptNo() == null ? 0 : this.getDeptNo().hashCode());
//		result = 37 * result + (getPatientId() == null ? 0 : this.getPatientId().hashCode());
//		result = 37 * result + (getBedNo() == null ? 0 : this.getBedNo().hashCode());
//		result = 37 * result + (getPrincipalIssue() == null ? 0 : this.getPrincipalIssue().hashCode());
//		result = 37 * result + (getMainSubIssue() == null ? 0 : this.getMainSubIssue().hashCode());
//		result = 37 * result + (getPrincipalIssueModifier() == null ? 0 : this.getPrincipalIssueModifier().hashCode());
//		result = 37 * result + (getMainSubIssueModifier() == null ? 0 : this.getMainSubIssueModifier().hashCode());
//		result = 37 * result + (getNursesComment() == null ? 0 : this.getNursesComment().hashCode());
//		result = 37 * result + (getAdmittedUnder() == null ? 0 : this.getAdmittedUnder().hashCode());
//		result = 37 * result + (getAssignedJrDoctor() == null ? 0 : this.getAssignedJrDoctor().hashCode());
//		result = 37 * result + (getPatinetState() == null ? 0 : this.getPatinetState().hashCode());
//		result = 37 * result + (getPatientStatus() == null ? 0 : this.getPatientStatus().hashCode());
//		result = 37 * result + (getPatientNeedsId() == null ? 0 : this.getPatientNeedsId().hashCode());
//		result = 37 * result + (getDateTimeStamp() == null ? 0 : this.getDateTimeStamp().hashCode());
//		return result;
//	}
//}
