package com.ambertag.phrc.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ambertag.phrc.model.Asset;
import com.ambertag.phrc.model.AssetMaster;

public interface AssetRepository extends JpaRepository<Asset, Long>{

}
