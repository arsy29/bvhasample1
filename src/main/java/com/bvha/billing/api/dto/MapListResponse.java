package com.bvha.billing.api.dto;

import com.bvha.billing.api.dto.Response;
import java.util.List;
import java.util.Map;

public class MapListResponse extends Response{

	private List<Map> responseResult;

	public MapListResponse(){}

	public MapListResponse(List<Map> responseResult){
		this.responseResult = responseResult;
	}
	
	public void setResponseResult(List<Map> responseResult){
		this.responseResult = responseResult;
	}

	public List<Map> getResponseResult(){
		return this.responseResult;
	}

}