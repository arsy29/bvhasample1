package com.bvha.billing.api.dto;

import com.bvha.billing.api.dto.Response;
import java.util.Map;

public class MapResponse extends Response{

	private Map responseResult;

	public MapResponse(){}
	
	public MapResponse(Map responseResult){
		this.responseResult = responseResult;
	}

	public void setResponseResult(Map responseResult){
		this.responseResult = responseResult;
	}

	public Map getResponseResult(){
		return this.responseResult;
	}

}