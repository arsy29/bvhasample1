package com.bvha.billing.persistence.dao;


import com.bvha.billing.persistence.SQLConnectionFactory;
import org.apache.ibatis.session.SqlSession;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class PaymentDAO {
	
	
	public List<Map> getPaymentByBillingId( Long billingId) throws Exception{
		List<Map> paymentList = null;

		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			paymentList = session.selectList("com.bvha.billing.persistence.mapper.payment.PaymentByBillingId", billingId);
		}catch(Exception e){
			throw e;
		}

		return paymentList;
	}

	public int addUpdatePaymentDetails( Map row) throws Exception{
		int result = 0;
		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			if(row.containsKey("id")){
				result = session.update("com.bvha.billing.persistence.mapper.payment.UpdatePayment", row);
			}else{
				result = session.insert("com.bvha.billing.persistence.mapper.payment.AddPayment", row);
			}
			session.commit();
		}catch(Exception e){
			throw e;
		}
		return result;
	}

	 public int deletePaymentById( Long paymentId) throws Exception{
		int result = 0;
		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			result = session.delete("com.bvha.billing.persistence.mapper.payment.DeletePayment", paymentId);
			session.commit();
		}catch(Exception e){
			throw e;
		}
		return result;
	} 

	public List<Map> getPaymentByPeriodId( Long periodId) throws Exception{
		List<Map> paymentList = null;

		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			paymentList = session.selectList("com.bvha.billing.persistence.mapper.payment.PaymentByPeriodId", periodId);
		}catch(Exception e){
			throw e;
		}

		return paymentList;
	}

	
}


