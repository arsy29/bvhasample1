package com.bvha.billing.api.dto;

import com.bvha.billing.api.dto.Response;
import java.util.List;

public class StringListResponse extends Response{

	private List<String> responseResult;

	public StringListResponse(){}

	public StringListResponse(List<String> responseResult){
		this.responseResult = responseResult;
	}

	public void setResponseResult(List<String> responseResult){
		this.responseResult = responseResult;
	}

	public List<String> getResponseResult(){
		return this.responseResult;
	}

}