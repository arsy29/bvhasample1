/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bvha.billing.reports.pojo;
import java.util.Map;
import java.util.List;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
/**
 *
 * @author MrSplendid
 */
public class BillingStatementPojo extends Object{
    private String id;
    private String name;
    private String address;
    private String balance;
    private String assocFee;
    private String currReading;
    private String prevReading;
    private String consumed;
    private String breakdown1;
    private String breakdown2;
    private String breakdown3;
    private String breakdownAmount1;
    private String breakdownAmount2;
    private String breakdownAmount3;
    private String waterTotal;
    private String total;
    private String othersDesc;
    private JRBeanCollectionDataSource payments;
    private String outstandingBalance;
    private String id2;
    private String name2;
    private String address2;
    private String balance2;
    private String assocFee2;
    private String currReading2;
    private String prevReading2;
    private String consumed2;
    private String breakdown12;
    private String breakdown22;
    private String breakdown32;
    private String breakdownAmount12;
    private String breakdownAmount22;
    private String breakdownAmount32;
    private String waterTotal2;
    private String total2;
    private String othersDesc2;
    private JRBeanCollectionDataSource payments2;
    private String outstandingBalance2;
    private String id3;
    private String name3;
    private String address3;
    private String balance3;
    private String assocFee3;
    private String currReading3;
    private String prevReading3;
    private String consumed3;
    private String breakdown13;
    private String breakdown23;
    private String breakdown33;
    private String breakdownAmount13;
    private String breakdownAmount23;
    private String breakdownAmount33;
    private String waterTotal3;
    private String total3;
    private String othersDesc3;
    private JRBeanCollectionDataSource payments3;
    private String outstandingBalance3;
    
    private String others;
    private String others2;
    private String others3;

    private String prevTotal;
    private String prevTotal2;
    private String prevTotal3;

    private Double isNull(Double value){
        if(value == null){
            value = 0D;
        }
        return value;
    }

     public BillingStatementPojo(Map column1, Map column2, Map column3){
        this.id = column1.get("id") + "";
        this.name = column1.get("lname") + ", " + column1.get("fname");
        this.address2 = column1.get("address") + "";
        // this.balance = column1.get("prevReading");
        this.assocFee = column1.get("assocFee") + "";
        // this.totalDues = column1.get("totalDues");
        this.prevReading = column1.get("prevReading") + "";
        this.currReading = column1.get("currReading") + "";
        double remaining  =  isNull((Double)column1.get("currReading")) - isNull((Double)column1.get("prevReading"));
        this.consumed = remaining + "";
        this.breakdown1 = "1st 10 cu.m P40/cu.m";
        this.breakdown2 = "11-30 cu.m P45/cu.m";
        this.breakdown3 = "31+ cu.m P50/cu.m";
        double totalWater;
        if(remaining < 10){
            totalWater = remaining * 40;
            this.breakdownAmount1 = totalWater + "";
            this.breakdownAmount2 ="0";
            this.breakdownAmount3 ="0";
        }else{
            remaining -= 10;
            totalWater = 400;
            this.breakdownAmount1 = "400";
            if(remaining < 20){
                totalWater += (remaining * 45);
                this.breakdownAmount2 = (remaining * 45) + "";
                this.breakdownAmount3 ="0";
            }else{
                remaining -= 20;
                totalWater += 900 + (remaining * 50);
                this.breakdownAmount2 = "900";
                this.breakdownAmount3 = (remaining * 50) + "";
            }
        }
        this.waterTotal = totalWater + "";
        this.total = column2.get("currentTotal") + "";
        this.othersDesc = column2.get("otherDesc") + "";
        this.others = column2.get("otherAmount") + "";
        this.prevTotal = column2.get("previousTotal") + "";
        this.outstandingBalance = column2.get("grandTotal") + "";
        if(column2 != null){
            this.id2 = column2.get("id") + "";
            this.name2 = column2.get("lname") + ", " + column2.get("fname");
            this.address2 = column2.get("address") + "";
            // this.balance2 = column2.get("prevReading");
            this.assocFee2 = column2.get("assocFee") + "";
            // this.totalDues2 = column2.get("totalDues");
            this.prevReading2 = column2.get("prevReading") + "";
            this.currReading2 = column2.get("currReading") + "";
            remaining  =  isNull((Double)column2.get("currReading")) -  isNull((Double)column2.get("prevReading"));
            this.consumed2 = remaining + "";
            this.breakdown12 = "1st 10 cu.m P40/cu.m";
            this.breakdown22 = "11-30 cu.m P45/cu.m";
            this.breakdown32 = "31+ cu.m P50/cu.m";
            if(remaining < 10){
                totalWater = remaining * 40;
                this.breakdownAmount12 = totalWater + "";
                this.breakdownAmount22 ="0";
                this.breakdownAmount32 ="0";
            }else{
                remaining -= 10;
                totalWater = 400;
                this.breakdownAmount12 = "400";
                if(remaining < 20){
                    totalWater += (remaining * 45);
                    this.breakdownAmount22 = (remaining * 45) + "";
                    this.breakdownAmount32 ="0";
                }else{
                    remaining -= 20;
                    totalWater += 900 + (remaining * 50);
                    this.breakdownAmount22 = "900";
                    this.breakdownAmount32 = (remaining * 50) + "";
                }
            }
            this.waterTotal2 = totalWater + "";
            this.total2 = column2.get("currentTotal") + "";
            this.othersDesc2 = column2.get("otherDesc") + "";
            this.others2 = column2.get("otherAmount") + "";
            this.prevTotal2 = column2.get("previousTotal") + "";
            this.outstandingBalance2 = column2.get("grandTotal") + "";
        }
        if(column3 != null){
            this.id3 = column3.get("id") + "";
            this.name3 = column3.get("lname") + ", " + column3.get("fname");
            this.address3 = column3.get("address") + "";
            // this.balance3 = column3.get("prevReading");
            this.assocFee3 = column3.get("assocFee") + "";
            // this.totalDues3 = column3.get("totalDues");
            this.prevReading3 = column3.get("prevReading") + "";
            this.currReading3 = column3.get("currReading") + "";
            remaining  = isNull((Double)column3.get("currReading")) - isNull((Double)column3.get("prevReading"));
            this.consumed3 = remaining + "";
            this.breakdown13 = "1st 10 cu.m P40/cu.m";
            this.breakdown23 = "11-30 cu.m P45/cu.m";
            this.breakdown33 = "31+ cu.m P50/cu.m";
            if(remaining < 10){
                totalWater = remaining * 40;
                this.breakdownAmount13 = totalWater + "";
                this.breakdownAmount23 = "0";
                this.breakdownAmount33 ="0";
            }else{
                remaining -= 10;
                totalWater = 400;
                this.breakdownAmount13 = "400";
                if(remaining < 20){
                    totalWater += (remaining * 45);
                    this.breakdownAmount23 = (remaining * 45) + "";
                    this.breakdownAmount33 ="0";
                }else{
                    remaining -= 20;
                    totalWater += 900 + (remaining * 50);
                    this.breakdownAmount23 = "900";
                    this.breakdownAmount33 = (remaining * 50) + "";
                }
            }
            this.waterTotal3 = totalWater + "";
            this.total3 = column3.get("currentTotal") + "";
            this.othersDesc3 = column3.get("otherDesc") + "";
            this.others3 = column3.get("otherAmount") + "";
            this.prevTotal3 = column3.get("previousTotal") + "";
            this.outstandingBalance3 = column3.get("grandTotal") + "";
        }
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the balance
     */
    public String getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }

    /**
     * @return the assocFee
     */
    public String getAssocFee() {
        return assocFee;
    }

    /**
     * @param assocFee the assocFee to set
     */
    public void setAssocFee(String assocFee) {
        this.assocFee = assocFee;
    }

  
    /**
     * @return the currReading
     */
    public String getCurrReading() {
        return currReading;
    }

    /**
     * @param currReading the currReading to set
     */
    public void setCurrReading(String currReading) {
        this.currReading = currReading;
    }

    /**
     * @return the prevReading
     */
    public String getPrevReading() {
        return prevReading;
    }

    /**
     * @param prevReading the prevReading to set
     */
    public void setPrevReading(String prevReading) {
        this.prevReading = prevReading;
    }

    /**
     * @return the consumed
     */
    public String getConsumed() {
        return consumed;
    }

    /**
     * @param consumed the consumed to set
     */
    public void setConsumed(String consumed) {
        this.consumed = consumed;
    }

    /**
     * @return the breakdown1
     */
    public String getBreakdown1() {
        return breakdown1;
    }

    /**
     * @param breakdown1 the breakdown1 to set
     */
    public void setBreakdown1(String breakdown1) {
        this.breakdown1 = breakdown1;
    }

    /**
     * @return the breakdown2
     */
    public String getBreakdown2() {
        return breakdown2;
    }

    /**
     * @param breakdown2 the breakdown2 to set
     */
    public void setBreakdown2(String breakdown2) {
        this.breakdown2 = breakdown2;
    }

    /**
     * @return the breakdown3
     */
    public String getBreakdown3() {
        return breakdown3;
    }

    /**
     * @param breakdown3 the breakdown3 to set
     */
    public void setBreakdown3(String breakdown3) {
        this.breakdown3 = breakdown3;
    }

    /**
     * @return the breakdownAmount1
     */
    public String getBreakdownAmount1() {
        return breakdownAmount1;
    }

    /**
     * @param breakdownAmount1 the breakdownAmount1 to set
     */
    public void setBreakdownAmount1(String breakdownAmount1) {
        this.breakdownAmount1 = breakdownAmount1;
    }

    /**
     * @return the breakdownAmount2
     */
    public String getBreakdownAmount2() {
        return breakdownAmount2;
    }

    /**
     * @param breakdownAmount2 the breakdownAmount2 to set
     */
    public void setBreakdownAmount2(String breakdownAmount2) {
        this.breakdownAmount2 = breakdownAmount2;
    }

    /**
     * @return the breakdownAmount3
     */
    public String getBreakdownAmount3() {
        return breakdownAmount3;
    }

    /**
     * @param breakdownAmount3 the breakdownAmount3 to set
     */
    public void setBreakdownAmount3(String breakdownAmount3) {
        this.breakdownAmount3 = breakdownAmount3;
    }

    /**
     * @return the waterTotal
     */
    public String getWaterTotal() {
        return waterTotal;
    }

    /**
     * @param waterTotal the waterTotal to set
     */
    public void setWaterTotal(String waterTotal) {
        this.waterTotal = waterTotal;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }

    
    /**
     * @return the id2
     */
    public String getId2() {
        return id2;
    }

    /**
     * @param id2 the id2 to set
     */
    public void setId2(String id2) {
        this.id2 = id2;
    }

    /**
     * @return the name2
     */
    public String getName2() {
        return name2;
    }

    /**
     * @param name2 the name2 to set
     */
    public void setName2(String name2) {
        this.name2 = name2;
    }

    /**
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @param address2 the address2 to set
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * @return the balance2
     */
    public String getBalance2() {
        return balance2;
    }

    /**
     * @param balance2 the balance2 to set
     */
    public void setBalance2(String balance2) {
        this.balance2 = balance2;
    }

    /**
     * @return the assocFee2
     */
    public String getAssocFee2() {
        return assocFee2;
    }

    /**
     * @param assocFee2 the assocFee2 to set
     */
    public void setAssocFee2(String assocFee2) {
        this.assocFee2 = assocFee2;
    }

   
    /**
     * @return the currReading2
     */
    public String getCurrReading2() {
        return currReading2;
    }

    /**
     * @param currReading2 the currReading2 to set
     */
    public void setCurrReading2(String currReading2) {
        this.currReading2 = currReading2;
    }

    /**
     * @return the prevReading2
     */
    public String getPrevReading2() {
        return prevReading2;
    }

    /**
     * @param prevReading2 the prevReading2 to set
     */
    public void setPrevReading2(String prevReading2) {
        this.prevReading2 = prevReading2;
    }

    /**
     * @return the consumed2
     */
    public String getConsumed2() {
        return consumed2;
    }

    /**
     * @param consumed2 the consumed2 to set
     */
    public void setConsumed2(String consumed2) {
        this.consumed2 = consumed2;
    }

    /**
     * @return the breakdown12
     */
    public String getBreakdown12() {
        return breakdown12;
    }

    /**
     * @param breakdown12 the breakdown12 to set
     */
    public void setBreakdown12(String breakdown12) {
        this.breakdown12 = breakdown12;
    }

    /**
     * @return the breakdown22
     */
    public String getBreakdown22() {
        return breakdown22;
    }

    /**
     * @param breakdown22 the breakdown22 to set
     */
    public void setBreakdown22(String breakdown22) {
        this.breakdown22 = breakdown22;
    }

    /**
     * @return the breakdown32
     */
    public String getBreakdown32() {
        return breakdown32;
    }

    /**
     * @param breakdown32 the breakdown32 to set
     */
    public void setBreakdown32(String breakdown32) {
        this.breakdown32 = breakdown32;
    }

    /**
     * @return the breakdownAmount12
     */
    public String getBreakdownAmount12() {
        return breakdownAmount12;
    }

    /**
     * @param breakdownAmount12 the breakdownAmount12 to set
     */
    public void setBreakdownAmount12(String breakdownAmount12) {
        this.breakdownAmount12 = breakdownAmount12;
    }

    /**
     * @return the breakdownAmount22
     */
    public String getBreakdownAmount22() {
        return breakdownAmount22;
    }

    /**
     * @param breakdownAmount22 the breakdownAmount22 to set
     */
    public void setBreakdownAmount22(String breakdownAmount22) {
        this.breakdownAmount22 = breakdownAmount22;
    }

    /**
     * @return the breakdownAmount32
     */
    public String getBreakdownAmount32() {
        return breakdownAmount32;
    }

    /**
     * @param breakdownAmount32 the breakdownAmount32 to set
     */
    public void setBreakdownAmount32(String breakdownAmount32) {
        this.breakdownAmount32 = breakdownAmount32;
    }

    /**
     * @return the waterTotal2
     */
    public String getWaterTotal2() {
        return waterTotal2;
    }

    /**
     * @param waterTotal2 the waterTotal2 to set
     */
    public void setWaterTotal2(String waterTotal2) {
        this.waterTotal2 = waterTotal2;
    }

    /**
     * @return the total2
     */
    public String getTotal2() {
        return total2;
    }

    /**
     * @param total2 the total2 to set
     */
    public void setTotal2(String total2) {
        this.total2 = total2;
    }

    

    /**
     * @return the id3
     */
    public String getId3() {
        return id3;
    }

    /**
     * @param id3 the id3 to set
     */
    public void setId3(String id3) {
        this.id3 = id3;
    }

    /**
     * @return the name3
     */
    public String getName3() {
        return name3;
    }

    /**
     * @param name3 the name3 to set
     */
    public void setName3(String name3) {
        this.name3 = name3;
    }

    /**
     * @return the address3
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * @param address3 the address3 to set
     */
    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    /**
     * @return the balance3
     */
    public String getBalance3() {
        return balance3;
    }

    /**
     * @param balance3 the balance3 to set
     */
    public void setBalance3(String balance3) {
        this.balance3 = balance3;
    }

    /**
     * @return the assocFee3
     */
    public String getAssocFee3() {
        return assocFee3;
    }

    /**
     * @param assocFee3 the assocFee3 to set
     */
    public void setAssocFee3(String assocFee3) {
        this.assocFee3 = assocFee3;
    }

   
    /**
     * @return the currReading3
     */
    public String getCurrReading3() {
        return currReading3;
    }

    /**
     * @param currReading3 the currReading3 to set
     */
    public void setCurrReading3(String currReading3) {
        this.currReading3 = currReading3;
    }

    /**
     * @return the prevReading3
     */
    public String getPrevReading3() {
        return prevReading3;
    }

    /**
     * @param prevReading3 the prevReading3 to set
     */
    public void setPrevReading3(String prevReading3) {
        this.prevReading3 = prevReading3;
    }

    /**
     * @return the consumed3
     */
    public String getConsumed3() {
        return consumed3;
    }

    /**
     * @param consumed3 the consumed3 to set
     */
    public void setConsumed3(String consumed3) {
        this.consumed3 = consumed3;
    }

    /**
     * @return the breakdown13
     */
    public String getBreakdown13() {
        return breakdown13;
    }

    /**
     * @param breakdown13 the breakdown13 to set
     */
    public void setBreakdown13(String breakdown13) {
        this.breakdown13 = breakdown13;
    }

    /**
     * @return the breakdown23
     */
    public String getBreakdown23() {
        return breakdown23;
    }

    /**
     * @param breakdown23 the breakdown23 to set
     */
    public void setBreakdown23(String breakdown23) {
        this.breakdown23 = breakdown23;
    }

    /**
     * @return the breakdown33
     */
    public String getBreakdown33() {
        return breakdown33;
    }

    /**
     * @param breakdown33 the breakdown33 to set
     */
    public void setBreakdown33(String breakdown33) {
        this.breakdown33 = breakdown33;
    }

    /**
     * @return the breakdownAmount13
     */
    public String getBreakdownAmount13() {
        return breakdownAmount13;
    }

    /**
     * @param breakdownAmount13 the breakdownAmount13 to set
     */
    public void setBreakdownAmount13(String breakdownAmount13) {
        this.breakdownAmount13 = breakdownAmount13;
    }

    /**
     * @return the breakdownAmount23
     */
    public String getBreakdownAmount23() {
        return breakdownAmount23;
    }

    /**
     * @param breakdownAmount23 the breakdownAmount23 to set
     */
    public void setBreakdownAmount23(String breakdownAmount23) {
        this.breakdownAmount23 = breakdownAmount23;
    }

    /**
     * @return the breakdownAmount33
     */
    public String getBreakdownAmount33() {
        return breakdownAmount33;
    }

    /**
     * @param breakdownAmount33 the breakdownAmount33 to set
     */
    public void setBreakdownAmount33(String breakdownAmount33) {
        this.breakdownAmount33 = breakdownAmount33;
    }

    /**
     * @return the waterTotal3
     */
    public String getWaterTotal3() {
        return waterTotal3;
    }

    /**
     * @param waterTotal3 the waterTotal3 to set
     */
    public void setWaterTotal3(String waterTotal3) {
        this.waterTotal3 = waterTotal3;
    }

    /**
     * @return the total3
     */
    public String getTotal3() {
        return total3;
    }

    /**
     * @param total3 the total3 to set
     */
    public void setTotal3(String total3) {
        this.total3 = total3;
    }

   
    

    /**
     * @return the outstandingBalance
     */
    public String getOutstandingBalance() {
        return outstandingBalance;
    }

    /**
     * @param outstandingBalance the outstandingBalance to set
     */
    public void setOutstandingBalance(String outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

    /**
     * @return the outstandingBalance2
     */
    public String getOutstandingBalance2() {
        return outstandingBalance2;
    }

    /**
     * @param outstandingBalance2 the outstandingBalance2 to set
     */
    public void setOutstandingBalance2(String outstandingBalance2) {
        this.outstandingBalance2 = outstandingBalance2;
    }

  

    /**
     * @return the outstandingBalance3
     */
    public String getOutstandingBalance3() {
        return outstandingBalance3;
    }

    /**
     * @param outstandingBalance3 the outstandingBalance3 to set
     */
    public void setOutstandingBalance3(String outstandingBalance3) {
        this.outstandingBalance3 = outstandingBalance3;
    }

    /**
     * @return the payments
     */
    public JRBeanCollectionDataSource getPayments() {
        return payments;
    }

    /**
     * @param payments the payments to set
     */
    public void setPayments(JRBeanCollectionDataSource payments) {
        this.payments = payments;
    }

    /**
     * @return the payments2
     */
    public JRBeanCollectionDataSource getPayments2() {
        return payments2;
    }

    /**
     * @param payments2 the payments2 to set
     */
    public void setPayments2(JRBeanCollectionDataSource payments2) {
        this.payments2 = payments2;
    }

    /**
     * @return the payments3
     */
    public JRBeanCollectionDataSource getPayments3() {
        return payments3;
    }

    /**
     * @param payments3 the payments3 to set
     */
    public void setPayments3(JRBeanCollectionDataSource payments3) {
        this.payments3 = payments3;
    }

    /**
     * @return the others
     */
    public String getOthers() {
        return others;
    }

    /**
     * @param others the others to set
     */
    public void setOthers(String others) {
        this.others = others;
    }

    /**
     * @return the others2
     */
    public String getOthers2() {
        return others2;
    }

    /**
     * @param others2 the others2 to set
     */
    public void setOthers2(String others2) {
        this.others2 = others2;
    }

    /**
     * @return the others3
     */
    public String getOthers3() {
        return others3;
    }

    /**
     * @param others3 the others3 to set
     */
    public void setOthers3(String others3) {
        this.others3 = others3;
    }

    /**
     * @return the othersDesc
     */
    public String getOthersDesc() {
        return othersDesc;
    }

    /**
     * @param othersDesc the othersDesc to set
     */
    public void setOthersDesc(String othersDesc) {
        this.othersDesc = othersDesc;
    }

    /**
     * @return the othersDesc2
     */
    public String getOthersDesc2() {
        return othersDesc2;
    }

    /**
     * @param othersDesc2 the othersDesc2 to set
     */
    public void setOthersDesc2(String othersDesc2) {
        this.othersDesc2 = othersDesc2;
    }

    /**
     * @return the othersDesc3
     */
    public String getOthersDesc3() {
        return othersDesc3;
    }

    /**
     * @param othersDesc3 the othersDesc3 to set
     */
    public void setOthersDesc3(String othersDesc3) {
        this.othersDesc3 = othersDesc3;
    }

    /**
     * @return the prevTotal
     */
    public String getPrevTotal() {
        return prevTotal;
    }

    /**
     * @param prevTotal the prevTotal to set
     */
    public void setPrevTotal(String prevTotal) {
        this.prevTotal = prevTotal;
    }

    /**
     * @return the prevTotal2
     */
    public String getPrevTotal2() {
        return prevTotal2;
    }

    /**
     * @param prevTotal2 the prevTotal2 to set
     */
    public void setPrevTotal2(String prevTotal2) {
        this.prevTotal2 = prevTotal2;
    }

    /**
     * @return the prevTotal3
     */
    public String getPrevTotal3() {
        return prevTotal3;
    }

    /**
     * @param prevTotal3 the prevTotal3 to set
     */
    public void setPrevTotal3(String prevTotal3) {
        this.prevTotal3 = prevTotal3;
    }

   


}
