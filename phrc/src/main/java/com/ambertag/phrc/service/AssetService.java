package com.ambertag.phrc.service;

import java.util.List;

import com.ambertag.phrc.model.Asset;

public interface AssetService {

	List<Asset> getAllAssets();

	Asset saveAsset(Asset asset);

}
