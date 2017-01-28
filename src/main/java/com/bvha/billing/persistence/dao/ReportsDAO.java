package com.bvha.billing.persistence.dao;

import com.bvha.billing.persistence.SQLConnectionFactory;
import org.apache.ibatis.session.SqlSession;
import com.bvha.billing.reports.pojo.*;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class ReportsDAO {

	public List<Map> getBillAll(Map map) throws Exception{
		List<Map> memberList = null;

		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			memberList = session.selectList("com.bvha.billing.persistence.mapper.reports.BillingDetailsAll", map);
		}catch(Exception e){
			throw e;
		}

		return memberList;
	}

	public List<Map> getBill(Map map) throws Exception{
		List<Map> memberList = null;

		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			memberList = session.selectList("com.bvha.billing.persistence.mapper.reports.BillingDetails", map);
		}catch(Exception e){
			throw e;
		}

		return memberList;
	}

	public List<BillingReportPojo> getBillingReportsData(Map map) throws Exception{
		List<BillingReportPojo> pojoList = null;

		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			pojoList = session.selectList("com.bvha.billing.persistence.mapper.reports.BillingReports", map);
		}catch(Exception e){
			throw e;
		}

		return pojoList;
	}

	public List<PaymentReportPojo> getPaymentReportData(Map map) throws Exception{
		List<PaymentReportPojo> pojoList = null;

		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			pojoList = session.selectList("com.bvha.billing.persistence.mapper.reports.PaymentReports", map);
		}catch(Exception e){
			throw e;
		}

		return pojoList;
	}
}