package com.ambertag.phrc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ambertag.phrc.model.Transaction;
import com.ambertag.phrc.model.repository.TransactionRepository;

public class TtransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionRepository transactionRepository;

	@Override
	public Transaction getPatientAsset(long admissionId) {
		// TODO Auto-generated method stub
	return transactionRepository.findById(admissionId);
}
}
