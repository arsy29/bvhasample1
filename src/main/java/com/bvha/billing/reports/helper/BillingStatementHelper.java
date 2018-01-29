package com.bvha.billing.reports.helper;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import com.bvha.billing.reports.pojo.*;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.sql.Date;


public class BillingStatementHelper{

	public JRBeanCollectionDataSource transformToDataSource(List<Map> collection){
        List<Object> pojoList = new ArrayList<Object>();
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            Map pojo1, pojo2 = null, pojo3 = null;
            pojo1 = (Map)iterator.next();
            if(iterator.hasNext()){
                pojo2 = (Map)iterator.next();
                if(iterator.hasNext()){
                    pojo3 = (Map)iterator.next();
                }
            }
            pojoList.add(getBillingDateSource(pojo1, pojo2, pojo3));
        }

        return  new JRBeanCollectionDataSource(pojoList);
	}


	private BillingStatementPojo getBillingDateSource(Map column1, Map column2, Map column3){
		BillingStatementPojo billingPojo = new BillingStatementPojo();
		billingPojo.setId(Long.parseLong(column1.get("id").toString()));
        billingPojo.setName( column1.get("lname") + ", " + column1.get("fname"));
        billingPojo.setAddress( column1.get("address").toString() );
        billingPojo.setAssocFee( (double)column1.get("assocFee") );
        billingPojo.setPrevReading((double)column1.get("prevReading"));
        billingPojo.setCurrReading((double)column1.get("currReading"));
        double remaining  =  isNull(billingPojo.getCurrReading()) - isNull(billingPojo.getPrevReading());
        billingPojo.setConsumed(remaining);
        double totalWater = 0;
        if(remaining < 10){
            billingPojo.setBreakdown1(remaining);
            billingPojo.setBreakdown2(0);
            billingPojo.setBreakdown3(0);
            totalWater = remaining * 40;
            billingPojo.setBreakdownAmount1(totalWater);
            billingPojo.setBreakdownAmount2(0);
            billingPojo.setBreakdownAmount3(0);
        }else{
            billingPojo.setBreakdown1(10);
            remaining -= 10;
            totalWater = 400;
            billingPojo.setBreakdownAmount1(400);
            if(remaining < 20){
                billingPojo.setBreakdown2(remaining);
                billingPojo.setBreakdown3(0);
                totalWater += (remaining * 45);
                billingPojo.setBreakdownAmount2(remaining * 45);
                billingPojo.setBreakdownAmount3(0);
            }else{
                billingPojo.setBreakdown2(20);
                remaining -= 20;
                billingPojo.setBreakdown3(remaining);
                totalWater += 900 + (remaining * 50);
                billingPojo.setBreakdownAmount2(900);
                billingPojo.setBreakdownAmount3(remaining * 50);
            }
        }
        billingPojo.setWaterTotal(totalWater);
        billingPojo.setTotal((double)column1.get("currentTotal"));
        billingPojo.setOthersDesc(column1.get("otherDesc").toString());
        billingPojo.setOthers((double)column1.get("otherAmount"));
        billingPojo.setBalance((double)column1.get("previousTotal"));
        billingPojo.setPrevTotal((double) column1.get("previousTotal") - (double) column1.get("previousPayment"));
        billingPojo.setOutstandingBalance((double)column1.get("grandTotal"));
        List<PaymentPojo> paymentList = new ArrayList<PaymentPojo>();
        List<Map> paymentMapList = (List<Map>) column1.get("payments");
        if(paymentMapList != null){
            for(Map payment: paymentMapList){
                PaymentPojo paymentPojo = getPaymentDataSource(payment);
                paymentList.add(paymentPojo);
            }
            billingPojo.setPayments(new JRBeanCollectionDataSource(paymentList));
        }
        
        if(column2 != null){
            billingPojo.setId2(Long.parseLong(column2.get("id").toString()));
            billingPojo.setName2( column2.get("lname") + ", " + column2.get("fname"));
            billingPojo.setAddress2( column2.get("address").toString() );
            billingPojo.setAssocFee2( (double)column2.get("assocFee") );
            billingPojo.setPrevReading2((double)column2.get("prevReading"));
            billingPojo.setCurrReading2((double)column2.get("currReading"));
            remaining  =  isNull(billingPojo.getCurrReading2()) - isNull(billingPojo.getPrevReading2());
            billingPojo.setConsumed2(remaining);
            totalWater = 0;
            if(remaining < 10){
                billingPojo.setBreakdown12(remaining);
                billingPojo.setBreakdown22(0);
                billingPojo.setBreakdown32(0);
                totalWater = remaining * 40;
                billingPojo.setBreakdownAmount12(totalWater);
                billingPojo.setBreakdownAmount22(0);
                billingPojo.setBreakdownAmount32(0);
            }else{
                billingPojo.setBreakdown12(10);
                remaining -= 10;
                totalWater = 400;
                billingPojo.setBreakdownAmount12(400);
                if(remaining < 20){
                    billingPojo.setBreakdown22(remaining);
                    billingPojo.setBreakdown32(0);
                    totalWater += (remaining * 45);
                    billingPojo.setBreakdownAmount22(remaining * 45);
                    billingPojo.setBreakdownAmount32(0);
                }else{
                    billingPojo.setBreakdown22(20);
                    remaining -= 20;
                    billingPojo.setBreakdown32(remaining);
                    totalWater += 900 + (remaining * 50);
                    billingPojo.setBreakdownAmount22(900);
                    billingPojo.setBreakdownAmount32(remaining * 50);
                }
            }
            billingPojo.setWaterTotal2(totalWater);
            billingPojo.setTotal2((double)column2.get("currentTotal"));
            billingPojo.setOthersDesc2(column2.get("otherDesc").toString());
            billingPojo.setOthers2((double)column2.get("otherAmount"));
            billingPojo.setBalance2((double)column2.get("previousTotal"));
            billingPojo.setPrevTotal2((double) column2.get("previousTotal") - (double) column2.get("previousPayment"));
            billingPojo.setOutstandingBalance2((double)column2.get("grandTotal"));
            List<PaymentPojo> paymentList2 = new ArrayList<PaymentPojo>();
            List<Map> paymentMapList2 = (List<Map>) column2.get("payments");
            if(paymentMapList2 != null){
                for(Map payment: paymentMapList2){
                    PaymentPojo paymentPojo = getPaymentDataSource(payment);
                    paymentList2.add(paymentPojo);
                }
                billingPojo.setPayments2(new JRBeanCollectionDataSource(paymentList2));
            }
        }
        if(column3 != null){
            billingPojo.setId3(Long.parseLong(column3.get("id").toString()));
            billingPojo.setName3( column3.get("lname") + ", " + column3.get("fname"));
            billingPojo.setAddress3( column3.get("address").toString() );
            billingPojo.setAssocFee3( (double)column3.get("assocFee") );
            billingPojo.setPrevReading3((double)column3.get("prevReading"));
            billingPojo.setCurrReading3((double)column3.get("currReading"));
            remaining  =  isNull(billingPojo.getCurrReading3()) - isNull(billingPojo.getPrevReading3());
            billingPojo.setConsumed3(remaining);
            totalWater = 0;
            if(remaining < 10){
                billingPojo.setBreakdown13(remaining);
                billingPojo.setBreakdown23(0);
                billingPojo.setBreakdown33(0);
                totalWater = remaining * 40;
                billingPojo.setBreakdownAmount13(totalWater);
                billingPojo.setBreakdownAmount23(0);
                billingPojo.setBreakdownAmount33(0);
            }else{
                billingPojo.setBreakdown13(10);
                remaining -= 10;
                totalWater = 400;
                billingPojo.setBreakdownAmount13(400);
                if(remaining < 20){
                    billingPojo.setBreakdown23(remaining);
                    billingPojo.setBreakdown33(0);
                    totalWater += (remaining * 45);
                    billingPojo.setBreakdownAmount23(remaining * 45);
                    billingPojo.setBreakdownAmount33(0);
                }else{
                    billingPojo.setBreakdown23(20);
                    remaining -= 20;
                    billingPojo.setBreakdown33(remaining);
                    totalWater += 900 + (remaining * 50);
                    billingPojo.setBreakdownAmount23(900);
                    billingPojo.setBreakdownAmount33(remaining * 50);
                }
            }
            billingPojo.setWaterTotal3(totalWater);
            billingPojo.setTotal3((double)column3.get("currentTotal"));
            billingPojo.setOthersDesc3(column3.get("otherDesc").toString());
            billingPojo.setOthers3((double)column3.get("otherAmount"));
            billingPojo.setBalance3((double)column3.get("previousTotal"));
            billingPojo.setPrevTotal3((double) column3.get("previousTotal") - (double) column3.get("previousPayment"));
            billingPojo.setOutstandingBalance3((double)column3.get("grandTotal"));
            List<PaymentPojo> paymentList3 = new ArrayList<PaymentPojo>();
            List<Map> paymentMapList3 = (List<Map>) column3.get("payments");
            if(paymentMapList3 != null){
                for(Map payment: paymentMapList3){
                    PaymentPojo paymentPojo = getPaymentDataSource(payment);
                    paymentList3.add(paymentPojo);
                }
                billingPojo.setPayments3(new JRBeanCollectionDataSource(paymentList3));
            }
        }
        
        
        return billingPojo;
	}

	private PaymentPojo getPaymentDataSource(Map map){
        PaymentPojo paymentPojo = new PaymentPojo();
        paymentPojo.setPaymentAmount((double)map.get("paymentAmount"));
        paymentPojo.setPaymentDate((Date)map.get("paymentDate"));
        paymentPojo.setReceiptNo(map.get("receiptNo")+"");
        return paymentPojo;
	}

    private Double isNull(Double value){
        if(value == null){
            value = 0D;
        }
        return value;
    } 
    private Long isNull(Long value){
        if(value == null){
            value = 0L;
        }
        return value;
    }
}