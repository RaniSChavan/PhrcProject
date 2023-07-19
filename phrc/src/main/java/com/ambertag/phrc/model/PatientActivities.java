//package com.ambertag.phrc.model;
//
//import java.io.Serializable;
//
//import javax.persistence.AttributeOverride;
//import javax.persistence.AttributeOverrides;
//import javax.persistence.Column;
//import javax.persistence.EmbeddedId;
//import javax.persistence.Entity;
//
//@Entity(name="patient_activities")
//public class PatientActivities implements Serializable{
///**
//	 * 
//	 */
//	private static final long serialVersionUID = -7754452242556261530L;
//private PatientActivitiesId id;
//
//public PatientActivities(PatientActivitiesId id) {
//	// TODO Auto-generated constructor stub
//	this.id=id;
//}
//
//
//@EmbeddedId
//
//@AttributeOverrides({ @AttributeOverride(name = "deptNo", column = @Column(name = "deptNo")),
//		@AttributeOverride(name = "patientId", column = @Column(name = "patientId")),
//		@AttributeOverride(name = "bedNo", column = @Column(name = "bedNo", length = 15)),
//		@AttributeOverride(name = "principalIssue", column = @Column(name = "principalIssue")),
//		@AttributeOverride(name = "mainSubIssue", column = @Column(name = "mainSubIssue")),
//		@AttributeOverride(name = "principalIssueModifier", column = @Column(name = "principalIssueModifier", length = 150)),
//		@AttributeOverride(name = "mainSubIssueModifier", column = @Column(name = "mainSubIssueModifier", length = 150)),
//		@AttributeOverride(name = "nursesComment", column = @Column(name = "nursesComment", length = 100)),
//		@AttributeOverride(name = "admittedUnder", column = @Column(name = "admittedUnder")),
//		@AttributeOverride(name = "assignedJrDoctor", column = @Column(name = "assignedJrDoctor")),
//		@AttributeOverride(name = "patinetState", column = @Column(name = "patinetState", length = 22)),
//		@AttributeOverride(name = "patientStatus", column = @Column(name = "patientStatus", length = 10)),
//		@AttributeOverride(name = "patientNeedsId", column = @Column(name = "patientNeedsId")),
//		@AttributeOverride(name = "dateTimeStamp", column = @Column(name = "dateTimeStamp", nullable = false, length = 0)) })
//
//
//public PatientActivitiesId getId() {
//	return id;
//}
//
//public void setId(PatientActivitiesId id) {
//	this.id = id;
//}
//}
