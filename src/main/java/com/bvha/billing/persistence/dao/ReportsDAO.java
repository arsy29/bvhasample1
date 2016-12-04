package com.bvha.billing.persistence.dao;

import com.bvha.billing.persistence.core.SQLConnectionFactory;
import org.apache.ibatis.session.SqlSession;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class ReportsDAO {

	public List<Map> getBillAll(long periodId) throws Exception{
		List<Map> memberList = null;

		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			memberList = session.selectList("com.bvha.billing.persistence.mapper.reports.BillingDetailsAll", periodId);
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
}