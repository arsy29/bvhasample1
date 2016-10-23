/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bvha.billing.persistence.model;


import java.util.List;


/**
 *
 * @author MrSplendid
 */
public class Member {
    private Long id;
    private String fName;
    private String lName;
    private String address;
    private Billing billing;
    private String status;
    private Double monthlyDues;
    private boolean withBond;
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
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
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
    
    // @Override
    // public String toString(){
    //     return getIdFormated()+" - "+lName+(fName == null? "" :", "+fName);
    // }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    // public String getIdFormated() {
    //     return String.format("%03d", id);

    // }
    
    // // public String getStringName(){
    // //     return lName+", "+fName;
    // // }

    /**
     * @return the monthlyDues
     */
    public Double getMonthlyDues() {
        return monthlyDues;
    }

    /**
     * @param monthlyDues the monthlyDues to set
     */
    public void setMonthlyDues(Double monthlyDues) {
        this.monthlyDues = monthlyDues;
    }

    /**
     * @return the withBond
     */
    public boolean isWithBond() {
        return withBond;
    }

    /**
     * @param withBond the withBond to set
     */
    public void setWithBond(boolean withBond) {
        this.withBond = withBond;
    }
    
    // public String toStringWithPaymentFlag(){
    //     return this.toString() + (this.getBilling().getPaymentList() != null && this.getBilling().getPaymentList().size() != 0 && this.getBilling().getPaymentList().get(0).getId() != null && this.getBilling().getPaymentList().get(0).getId() != 0 ? "(PAID)" : "");
    // }

}
