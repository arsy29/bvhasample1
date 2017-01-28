package com.bvha.billing.persistence.dao;

import com.bvha.billing.persistence.SQLConnectionFactory;
import org.apache.ibatis.session.SqlSession;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class DashboardDAO{

	public List<Map> getCompletionRate(long periodId) throws Exception{
		List<Map> data = null;
		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			data = session.selectList("com.bvha.billing.persistence.mapper.dashboard.BillCompletionRate", periodId);
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}

		return data;
	}
	public List<Map> getCompletionGraph(long periodId) throws Exception{
		List<Map> data = null;
		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			data = session.selectList("com.bvha.billing.persistence.mapper.dashboard.BillCompletionGraph", periodId);
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}

		return data;
	}
	public List<Map> getCollectionGraph(long periodId) throws Exception{
		List<Map> data = null;
		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			data = session.selectList("com.bvha.billing.persistence.mapper.dashboard.CollectionGraph", periodId);
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}

		return data;
	}

}