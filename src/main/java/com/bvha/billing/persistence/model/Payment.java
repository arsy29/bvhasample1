/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bvha.billing.persistence.model;

// import com.bvhabilling.java.commons.Common;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author MrSplendid
 */
public class Payment {
    private Long id;
    private Member member;
    private Billing billing;
    private Double amount;
//    private Double balance;
    private Date paymentDate;
    private String receiptNo;

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
     * @return the billing
     */
    public Billing getBilling() {
        return billing;
    }

    /**
     * @param billing the billing to set
     */
    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    /**
     * @return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

//    /**
//     * @return the balance
//     */
//    public Double getBalance() {
//        return balance;
//    }
//
//    /**
//     * @param balance the balance to set
//     */
//    public void setBalance(Double balance) {
//        this.balance = balance;
//    }

    /**
     * @return the paymentDate
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * @param paymentDate the paymentDate to set
     */
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * @return the receiptNo
     */
    public String getReceiptNo() {
        return receiptNo;
    }

    /**
     * @param receiptNo the receiptNo to set
     */
    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }
    
    // public String toString(){
    //     return receiptNo+" "+Common.formatDate(paymentDate);
    // }
}
