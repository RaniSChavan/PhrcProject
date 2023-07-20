package com.ambertag.phrc.model.repository;

import com.ambertag.phrc.model.Transaction;

public interface TransactionRepository {

	Transaction findById(long admissionId);

}
