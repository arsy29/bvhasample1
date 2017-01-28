package com.bvha.billing.reports.pojo;

import java.sql.Date;

public class PaymentReportPojo{
	private int id;
    private String homeOwner;
    private Date receiptDate;
    private String receiptNumber;
    private Double receiptAmount;

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
}