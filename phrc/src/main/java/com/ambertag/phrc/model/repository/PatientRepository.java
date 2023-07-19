package com.ambertag.phrc.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ambertag.phrc.model.PatientDetails;

public interface PatientRepository extends JpaRepository<PatientDetails, Long>{

}
