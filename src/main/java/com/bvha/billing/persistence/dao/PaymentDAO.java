package com.bvha.billing.persistence.dao;


import com.bvha.billing.persistence.core.SQLConnectionFactory;
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

	
}


