package com.bvha.billing.reports.pojo;

import java.util.Map;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/

/**
*
* @author MrSplendid
*/
public class BillingStatementPojo extends Object{
    private Long id;
    private String name;
    private String address;
    private double balance;
    private double assocFee;
    private double currReading;
    private double prevReading;
    private double consumed;
    private double breakdown1;
    private double breakdown2;
    private double breakdown3;
    private double breakdownAmount1;
    private double breakdownAmount2;
    private double breakdownAmount3;
    private double waterTotal;
    private double total;
    private String othersDesc;
    private double others;
    private double prevTotal;
    private JRBeanCollectionDataSource payments;
    private double outstandingBalance;

    private long id2;
    private String name2;
    private String address2;
    private double balance2;
    private double assocFee2;
    private double currReading2;
    private double prevReading2;
    private double consumed2;
    private double breakdown12;
    private double breakdown22;
    private double breakdown32;
    private double breakdownAmount12;
    private double breakdownAmount22;
    private double breakdownAmount32;
    private double waterTotal2;
    private double total2;
    private String othersDesc2;
    private double others2;
    private double prevTotal2;
    private JRBeanCollectionDataSource payments2;
    private double outstandingBalance2;

    private long id3;
    private String name3;
    private String address3;
    private double balance3;
    private double assocFee3;
    private double currReading3;
    private double prevReading3;
    private double consumed3;
    private double breakdown13;
    private double breakdown23;
    private double breakdown33;
    private double breakdownAmount13;
    private double breakdownAmount23;
    private double breakdownAmount33;
    private double waterTotal3;
    private double total3;
    private String othersDesc3;
    private double others3;
    private double prevTotal3;
    private JRBeanCollectionDataSource payments3;
    private double outstandingBalance3;

    // Column 1
    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
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

    public double getCurrReading(){
        return this.currReading;
    }

    public void setCurrReading(double currReading){
        this.currReading = currReading;
    }

    public double getPrevReading(){
        return this.prevReading;
    }

    public void setPrevReading(double prevReading){
        this.prevReading = prevReading;
    }

    public double getConsumed(){
        return this.consumed;
    }

    public void setConsumed(double consumed){
        this.consumed = consumed;
    }

    public double getBreakdown1(){
        return this.breakdown1;
    }

    public void setBreakdown1(double breakdown1){
        this.breakdown1 = breakdown1;
    }

    public double getBreakdown2(){
        return this.breakdown2;
    }

    public void setBreakdown2(double breakdown2){
        this.breakdown2 = breakdown2;
    }

    public double getBreakdown3(){
        return this.breakdown3;
    }

    public void setBreakdown3(double breakdown3){
        this.breakdown3 = breakdown3;
    }

    public double getBreakdownAmount1(){
        return this.breakdownAmount1;
    }

    public void setBreakdownAmount1(double breakdownAmount1){
        this.breakdownAmount1 = breakdownAmount1;
    }

    
    public double getBreakdownAmount2(){
        return this.breakdownAmount2;
    }

    public void setBreakdownAmount2(double breakdownAmount2){
        this.breakdownAmount2 = breakdownAmount2;
    }

    
    public double getBreakdownAmount3(){
        return this.breakdownAmount3;
    }

    public void setBreakdownAmount3(double breakdownAmount3){
        this.breakdownAmount3 = breakdownAmount3;
    }

    public double getWaterTotal(){
        return this.waterTotal;
    }

    public void setWaterTotal(double waterTotal){
        this.waterTotal = waterTotal;
    }

    public double getTotal(){
        return this.total;
    }

    public void setTotal(double total){
        this.total = total;
    }

    public String getOthersDesc(){
        return this.othersDesc;
    }

    public void setOthersDesc(String othersDesc){
        this.othersDesc =  othersDesc;
    }

    public double getOthers(){
        return this.others;
    }

    public void setOthers(double others){
        this.others = others;
    }

    public double getPrevTotal(){
        return this.prevTotal;
    }

    public void setPrevTotal(double prevTotal){
        this.prevTotal = prevTotal;
    }

    public JRBeanCollectionDataSource getPayments(){
        return this.payments;
    }

    public void setPayments(JRBeanCollectionDataSource payments){
        this.payments = payments;
    }

    public double getOutstandingBalance(){
        return this.outstandingBalance;
    }

    public void setOutstandingBalance(double outstandingBalance){
        this.outstandingBalance = outstandingBalance;
    }


    // Column 2
    public long getId2(){
        return this.id2;
    }

    public void setId2(long id){
        this.id2 = id;
    }

    public String getName2(){
        return this.name2;
    }

    public void setName2(String name){
        this.name2 = name;
    }

    public String getAddress2(){
        return this.address2;
    }

    public void setAddress2(String address){
        this.address2 = address;
    }

    public double getBalance2(){
        return this.balance2;
    }

    public void setBalance2(double balance){
        this.balance2 = balance;
    }

    public double getAssocFee2(){
        return this.assocFee2;
    }

    public void setAssocFee2(double assocFee){
        this.assocFee2 = assocFee;
    }

    public double getCurrReading2(){
        return this.currReading2;
    }

    public void setCurrReading2(double currReading){
        this.currReading2 = currReading;
    }

    public double getPrevReading2(){
        return this.prevReading2;
    }

    public void setPrevReading2(double prevReading){
        this.prevReading2 = prevReading;
    }

    public double getConsumed2(){
        return this.consumed2;
    }

    public void setConsumed2(double consumed){
        this.consumed2 = consumed;
    }

    public double getBreakdown12(){
        return this.breakdown12;
    }

    public void setBreakdown12(double breakdown1){
        this.breakdown12 = breakdown1;
    }

    public double getBreakdown22(){
        return this.breakdown22;
    }

    public void setBreakdown22(double breakdown2){
        this.breakdown22 = breakdown2;
    }

    public double getBreakdown32(){
        return this.breakdown32;
    }

    public void setBreakdown32(double breakdown3){
        this.breakdown32 = breakdown3;
    }

    public double getBreakdownAmount12(){
        return this.breakdownAmount12;
    }

    public void setBreakdownAmount12(double breakdownAmount1){
        this.breakdownAmount12 = breakdownAmount1;
    }

    
    public double getBreakdownAmount22(){
        return this.breakdownAmount22;
    }

    public void setBreakdownAmount22(double breakdownAmount2){
        this.breakdownAmount22 = breakdownAmount2;
    }

    
    public double getBreakdownAmount32(){
        return this.breakdownAmount32;
    }

    public void setBreakdownAmount32(double breakdownAmount3){
        this.breakdownAmount32 = breakdownAmount3;
    }

    public double getWaterTotal2(){
        return this.waterTotal2;
    }

    public void setWaterTotal2(double waterTotal){
        this.waterTotal2 = waterTotal;
    }

    public double getTotal2(){
        return this.total2;
    }

    public void setTotal2(double total){
        this.total2 = total;
    }

    public String getOthersDesc2(){
        return this.othersDesc2;
    }

    public void setOthersDesc2(String othersDesc){
        this.othersDesc2 =  othersDesc;
    }

    public double getOthers2(){
        return this.others2;
    }

    public void setOthers2(double others){
        this.others2 = others;
    }

    public double getPrevTotal2(){
        return this.prevTotal2;
    }

    public void setPrevTotal2(double prevTotal){
        this.prevTotal2 = prevTotal;
    }

    public JRBeanCollectionDataSource getPayments2(){
        return this.payments2;
    }

    public void setPayments2(JRBeanCollectionDataSource payments){
        this.payments2 = payments;
    }

    public double getOutstandingBalance2(){
        return this.outstandingBalance2;
    }

    public void setOutstandingBalance2(double outstandingBalance){
        this.outstandingBalance2 = outstandingBalance;
    }

    // Column 3
    public long getId3(){
        return this.id3;
    }

    public void setId3(long id){
        this.id3 = id;
    }

    public String getName3(){
        return this.name3;
    }

    public void setName3(String name){
        this.name3 = name;
    }

    public String getAddress3(){
        return this.address3;
    }

    public void setAddress3(String address){
        this.address3 = address;
    }

    public double getBalance3(){
        return this.balance3;
    }

    public void setBalance3(double balance){
        this.balance3 = balance;
    }

    public double getAssocFee3(){
        return this.assocFee3;
    }

    public void setAssocFee3(double assocFee){
        this.assocFee3 = assocFee;
    }

    public double getCurrReading3(){
        return this.currReading3;
    }

    public void setCurrReading3(double currReading){
        this.currReading3 = currReading;
    }

    public double getPrevReading3(){
        return this.prevReading3;
    }

    public void setPrevReading3(double prevReading){
        this.prevReading3 = prevReading;
    }

    public double getConsumed3(){
        return this.consumed3;
    }

    public void setConsumed3(double consumed){
        this.consumed3 = consumed;
    }

    public double getBreakdown13(){
        return this.breakdown13;
    }

    public void setBreakdown13(double breakdown1){
        this.breakdown13 = breakdown1;
    }

    public double getBreakdown23(){
        return this.breakdown23;
    }

    public void setBreakdown23(double breakdown2){
        this.breakdown23 = breakdown2;
    }

    public double getBreakdown33(){
        return this.breakdown33;
    }

    public void setBreakdown33(double breakdown3){
        this.breakdown33 = breakdown3;
    }

    public double getBreakdownAmount13(){
        return this.breakdownAmount13;
    }

    public void setBreakdownAmount13(double breakdownAmount1){
        this.breakdownAmount13 = breakdownAmount1;
    }

    
    public double getBreakdownAmount23(){
        return this.breakdownAmount23;
    }

    public void setBreakdownAmount23(double breakdownAmount2){
        this.breakdownAmount23 = breakdownAmount2;
    }

    
    public double getBreakdownAmount33(){
        return this.breakdownAmount33;
    }

    public void setBreakdownAmount33(double breakdownAmount3){
        this.breakdownAmount33 = breakdownAmount3;
    }

    public double getWaterTotal3(){
        return this.waterTotal3;
    }

    public void setWaterTotal3(double waterTotal){
        this.waterTotal3 = waterTotal;
    }

    public double getTotal3(){
        return this.total3;
    }

    public void setTotal3(double total){
        this.total3 = total;
    }

    public String getOthersDesc3(){
        return this.othersDesc3;
    }

    public void setOthersDesc3(String othersDesc){
        this.othersDesc3 =  othersDesc;
    }

    public double getOthers3(){
        return this.others3;
    }

    public void setOthers3(double others){
        this.others3 = others;
    }

    public double getPrevTotal3(){
        return this.prevTotal3;
    }

    public void setPrevTotal3(double prevTotal){
        this.prevTotal3 = prevTotal;
    }

    public JRBeanCollectionDataSource getPayments3(){
        return this.payments3;
    }

    public void setPayments3(JRBeanCollectionDataSource payments){
        this.payments3 = payments;
    }

    public double getOutstandingBalance3(){
        return this.outstandingBalance3;
    }

    public void setOutstandingBalance3(double outstandingBalance){
        this.outstandingBalance3 = outstandingBalance;
    }

}
