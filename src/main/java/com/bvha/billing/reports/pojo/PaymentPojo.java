package com.bvha.billing.reports.pojo;

import java.sql.Date;
import java.util.Map;

public class PaymentPojo extends Object{
	private double paymentAmount;
	private Date paymentDate;
	private String receiptNo;

	public double getPaymentAmount(){
		return this.paymentAmount;
	}

	public void setPaymentAmount(double paymentAmount){
		this.paymentAmount = paymentAmount;
	}

	public Date getPaymentDate(){
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate){
		this.paymentDate = paymentDate;
	}

	public String getReceiptNo(){
		return this.receiptNo;
	}

	public void setReceiptNo(String receiptNo){
		this.receiptNo = receiptNo;
	}
	@Override
	public String toString(){
		return "paymentAmount: "+ this.paymentAmount +" | paymentDate: " + this.paymentDate + " | receiptNo: " +this.receiptNo;
	}
}
