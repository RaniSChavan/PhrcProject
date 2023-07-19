package com.ambertag.phrc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambertag.phrc.model.Asset;
import com.ambertag.phrc.model.repository.AssetRepository;

@Service
public class AssetServiceImpl implements AssetService {

	@Autowired
	private AssetRepository assetRepository;

	@Override
	public List<Asset> getAllAssets() {
		// TODO Auto-generated method stub
		return assetRepository.findAll();
	}

	@Override
	public Asset saveAsset(Asset asset) {
		// TODO Auto-generated method stub
		return assetRepository.save(asset);
	}

}
