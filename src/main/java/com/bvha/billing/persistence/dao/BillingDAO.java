package com.bvha.billing.persistence.dao;


import com.bvha.billing.persistence.core.SQLConnectionFactory;
import org.apache.ibatis.session.SqlSession;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class BillingDAO {
	
	
	public Map getBillingDetails(long periodId, long memberId ) throws Exception{

		Map billing = null; 
		Map parameterMap = new HashMap();
		parameterMap.put("periodId", periodId);
		parameterMap.put("memberId", memberId);
		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			billing = session.selectOne("com.bvha.billing.persistence.mapper.billing.BillingDetails",parameterMap);
		}catch(Exception e){
			throw e;
		}

		return billing;
	}

	public List<String> getPeriodYear() throws Exception{
		List<String> yearList = null;

		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			yearList = session.selectList("com.bvha.billing.persistence.mapper.billing.BillingYear");
		}catch(Exception e){
			throw e;
		}

		return yearList;

	}

	public List<Map> getPeriodByYear( String periodYear) throws Exception{
		List<Map> periodList = null;

		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			periodList = session.selectList("com.bvha.billing.persistence.mapper.billing.BillingMonth", periodYear);
		}catch(Exception e){
			throw e;
		}

		return periodList;
	}

	public List<Map> getMemberBillList( Long periodId) throws Exception{
		List<Map> memberList = null;

		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			memberList = session.selectList("com.bvha.billing.persistence.mapper.billing.MemberBillList", periodId);
		}catch(Exception e){
			throw e;
		}

		return memberList;
	}
}


