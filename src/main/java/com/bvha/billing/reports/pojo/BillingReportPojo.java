package com.bvha.billing.reports.pojo;

public class BillingReportPojo extends Object{
	private String name;
	private double presentReading;
	private double previousReading;
	private double totalConsumed;
	private double amount;
	private double balance;
	private double assocFee;
	private double total;
	private double collection;
	private double receivable;
	private double other;



	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public double getPresentReading(){
		return this.presentReading;
	}

	public void setPresentReading(double presentReading){
		this.presentReading = presentReading;
	}

	public double getPreviousReading(){
		return this.previousReading;
	}

	public void setPreviousReading(double previousReading){
		this.previousReading = previousReading;
	}

	public double getTotalConsumed(){
		return this.totalConsumed;
	}

	public void setTotalConsumed(double totalConsumed){
		this.totalConsumed = totalConsumed;
	}

	public double getAmount(){
		return this.amount;
	}

	public void setAmount(double amount){
		this.amount = amount;
	}

	public double getBalance(){
		return this.balance;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public double getAssocFee(){
		return this.assocFee;
	}

	public void setAssocFee(double assocFee){
		this.assocFee = assocFee;
	}

	public double getTotal(){
		return this.total;
	}

	public void setTotal(double total){
		this.total = total;
	}

	public double getCollection(){
		return this.collection;
	}

	public void setCollection(double collection){
		this.collection = collection;
	}

	public double getReceivable(){
		return this.receivable;
	}

	public void setReceivable(double receivable){
		this.receivable = receivable;
	}

	public double getOther(){
		return this.other;
	}

	public void setOther(double other){
		this.other = other;
	}
}