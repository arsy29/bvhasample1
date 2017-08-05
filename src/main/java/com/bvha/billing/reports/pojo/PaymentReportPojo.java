package com.bvha.billing.reports.pojo;

import java.sql.Date;

public class PaymentReportPojo{
	private int id;
    private String homeOwner;
    private Date receiptDate;
    private String receiptNumber;
    private Double receiptAmount;
    private String transactionType;
    private int header = 1;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the homeOwner
     */
    public String getHomeOwner() {
        return homeOwner;
    }

    /**
     * @param homeOwner the homeOwner to set
     */
    public void setHomeOwner(String homeOwner) {
        this.homeOwner = homeOwner;
    }

    /**
     * @return the receiptDate
     */
    public Date getReceiptDate() {
        return receiptDate;
    }

    /**
     * @param receiptDate the receiptDate to set
     */
    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }
    

    /**
     * @return the receiptNumber
     */
    public String getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * @param receiptNumber the receiptNumber to set
     */
    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    /**
     * @return the receiptAmount
     */
    public Double getReceiptAmount() {
        return receiptAmount;
    }

    /**
     * @param receiptAmount the receiptAmount to set
     */
    public void setReceiptAmount(Double receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

	public String getTransactionType() {
		return transactionType;
	}
	
	private String[] transactionTypeMap = { "All",
		  "Water Dues",
		  "Water Meter",
		  "Shooting Fee",
		  "Membership Fee",
		  "Maintenance Fee",
		  "ID",
		  "Development Fee",
		  "Court Use",
		  "Construction Fee",
		  "Construction Bond",
		  "Sticker",
		  "Other"
		  };
	
	public void setTransactionType(int transactionType) {
		this.transactionType = transactionTypeMap[transactionType];
	}

	public int getHeader() {
		return header;
	}

	public void setHeader(int header) {
		this.header = header;
	}
}