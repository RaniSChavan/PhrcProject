package com.ambertag.phrc.service;

import com.ambertag.phrc.model.Transaction;

public interface TransactionService {

	Transaction getPatientAsset(long admissionId);

}
