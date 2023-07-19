package com.ambertag.phrc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ambertag.phrc.model.ApiResponse;
import com.ambertag.phrc.model.Asset;
import com.ambertag.phrc.service.AssetService;

@RestController
@RequestMapping("/phrc/api/v1/main")
public class AssetController {
	@Autowired
	private AssetService assetService;
	
	@PostMapping("saveAsset")
	public ResponseEntity<Asset> saveAsset(@RequestBody Asset asset){
		return new ResponseEntity<Asset>(assetService.saveAsset(asset), HttpStatus.CREATED);
	}

	@GetMapping("getAssets")
	public ApiResponse getAssets() {
		ApiResponse response = new ApiResponse();
		response.setStatus("success");


	List<Asset> assets=assetService.getAllAssets();
	response.setData(assets);
	
	response.setMessage("success");
	return response;
	}
}
