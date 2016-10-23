/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bvha.billing.persistence.model;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author MrSplendid
 */
public class Billing {
    private Long id;
    private Member member;
    //Assoc
    private Double assocFee;
    private Boolean withBond;
    //Water
    private Double prevReading;
    private Double currReading;
    //Breakdown
    private Double waterAmount;
    //TOTAL
    private Double currentTotal;
    private Double previousTotal;
    private List<Payment> previousPayment;
    private Double previousPaymentTotal;
    private String otherDescription;
    private Double otherAmount;
    private Double grandTotal;
    //others
    private List<Payment> paymentList; // for fp module
    private Long period; //to connect to a period
    private Long prevBillingId; //to connect to the previous billing id

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the member
     */
    public Member getMember() {
        return member;
    }

    /**
     * @param member the member to set
     */
    public void setMember(Member member) {
        this.member = member;
    }

    /**
     * @return the assocFee
     */
    public Double getAssocFee() {
        return assocFee;
    }

    /**
     * @param assocFee the assocFee to set
     */
    public void setAssocFee(Double assocFee) {
        this.assocFee = assocFee;
    }

    /**
     * @return the prevReading
     */
    public Double getPrevReading() {
        return prevReading;
    }

    /**
     * @param prevReading the prevReading to set
     */
    public void setPrevReading(Double prevReading) {
        this.prevReading = prevReading;
    }

    /**
     * @return the currReading
     */
    public Double getCurrReading() {
        return currReading;
    }

    /**
     * @param currReading the currReading to set
     */
    public void setCurrReading(Double currReading) {
        this.currReading = currReading;
    }

    /**
     * @return the waterAmount
     */
    public Double getWaterAmount() {
        return waterAmount;
    }

    /**
     * @param waterAmount the waterAmount to set
     */
    public void setWaterAmount(Double waterAmount) {
        this.waterAmount = waterAmount;
    }
//
//    /**
//     * @return the billingDate
//     */
//    public Date getBillingDate() {
//        return billingDate;
//    }
//
//    /**
//     * @param billingDate the billingDate to set
//     */
//    public void setBillingDate(Date billingDate) {
//        this.billingDate = billingDate;
//    }

    /**
     * @return the withBond
     */
    public Boolean getWithBond() {
        return withBond;
    }

    /**
     * @param withBond the withBond to set
     */
    public void setWithBond(Boolean withBond) {
        this.withBond = withBond;
    }

    /**
     * @return the paymentList
     */
    public List<Payment> getPaymentList() {
        return paymentList;
    }

    /**
     * @param paymentList the paymentList to set
     */
    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    /**
     * @return the previousTotal
     */
    public Double getPreviousTotal() {
        return previousTotal;
    }

    /**
     * @param previousTotal the previousTotal to set
     */
    public void setPreviousTotal(Double previousTotal) {
        this.previousTotal = previousTotal;
    }

    /**
     * @return the otherDescription
     */
    public String getOtherDescription() {
        return otherDescription;
    }

    /**
     * @param otherDescription the otherDescription to set
     */
    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    /**
     * @return the otherAmount
     */
    public Double getOtherAmount() {
        return otherAmount;
    }

    /**
     * @param otherAmount the otherAmount to set
     */
    public void setOtherAmount(Double otherAmount) {
        this.otherAmount = otherAmount;
    }

    /**
     * @return the grandTotal
     */
    public Double getGrandTotal() {
        return grandTotal;
    }

    /**
     * @param grandTotal the grandTotal to set
     */
    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }

    /**
     * @return the currentTotal
     */
    public Double getCurrentTotal() {
        return currentTotal;
    }

    /**
     * @param currentTotal the currentTotal to set
     */
    public void setCurrentTotal(Double currentTotal) {
        this.currentTotal = currentTotal;
    }

    /**
     * @return the previousPayment
     */

    /**
     * @return the period
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * @param period the period to set
     */
    public void setPeriod(Period period) {
        this.period = period;
    }

    /**
     * @return the previousPayment
     */
    public List<Payment> getPreviousPayment() {
        return previousPayment;
    }

    /**
     * @param previousPayment the previousPayment to set
     */
    public void setPreviousPayment(List<Payment> previousPayment) {
        this.previousPayment = previousPayment;
    }

    /**
     * @return the previousPaymentTotal
     */
    public Double getPreviousPaymentTotal() {
        return previousPaymentTotal;
    }

    /**
     * @param previousPaymentTotal the previousPaymentTotal to set
     */
    public void setPreviousPaymentTotal(Double previousPaymentTotal) {
        this.previousPaymentTotal = previousPaymentTotal;
    }

    /**
     * @return the prevBillingId
     */
    public Long getPrevBillingId() {
        return prevBillingId;
    }

    /**
     * @param prevBillingId the prevBillingId to set
     */
    public void setPrevBillingId(Long prevBillingId) {
        this.prevBillingId = prevBillingId;
    }

    
    
 
    
}
