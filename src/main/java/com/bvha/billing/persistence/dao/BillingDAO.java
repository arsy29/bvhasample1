package com.bvha.billing.persistence.dao;


import com.bvha.billing.persistence.SQLConnectionFactory;
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

	public Map generateBilling() throws Exception{
		Map bill = new HashMap();

		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			bill.put("period", session.selectOne("com.bvha.billing.persistence.mapper.billing.GeneratePeriod"));
			bill.put("list",session.selectList("com.bvha.billing.persistence.mapper.billing.GenerateBill"));
		}catch(Exception e){
			throw e;
		}

		return bill;
	}

	public List<Map> reset() throws Exception{
		List<Map> bill = null;

		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			bill = session.selectList("com.bvha.billing.persistence.mapper.billing.GenerateBill");
		}catch(Exception e){
			throw e;
		}

		return bill;
	}

	public Map checkForDraft() throws Exception{
		Map bill = new HashMap();

		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			Map period = (Map)session.selectOne("com.bvha.billing.persistence.mapper.billing.CheckForDraft");
			if(period.get("id") == null){
				return null;
			}
			bill.put("period",period);
			bill.put("list",session.selectList("com.bvha.billing.persistence.mapper.billing.getDraftBillingDetails",period.get("id")));
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}

		return bill;
	}

	public int submit( Map map) throws Exception{
		int result = 0;
		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			Map period = (Map)map.get("period");
			if(period.get("status").toString().equals("A")){
				session.update("com.bvha.billing.persistence.mapper.billing.archivePeriod");
			}
			if((boolean)map.get("isNew")){
				session.insert("com.bvha.billing.persistence.mapper.billing.newPeriod", period);
				for(Map bill: (List<Map>)map.get("list")){
					bill.put("periodId", period.get("id"));
				}
				result = session.insert("com.bvha.billing.persistence.mapper.billing.Submit", map);
			}else{
				result = session.update("com.bvha.billing.persistence.mapper.billing.updatePeriod", period);
				for(Map row : (List<Map>)map.get("list")){
					result += session.update("com.bvha.billing.persistence.mapper.billing.update", row);
				}
			}
			session.commit();
		}catch(Exception e){
			throw e;
		}
		return result;
	}

	
}


