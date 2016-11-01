package com.bvha.billing.api.dto;



public class Response{

	private int responseStatus;
	private String responseMessage;

	public void setResponseStatus(int responseStatus){
		this.responseStatus = responseStatus;
	}

	public int getResponseStatus(){
		return this.responseStatus;
	}

	public void setResponseMessage(String responseMessage){
		this.responseMessage = responseMessage;
	}

	public String getResponseMessage(){
		return this.responseMessage;
	}

}
