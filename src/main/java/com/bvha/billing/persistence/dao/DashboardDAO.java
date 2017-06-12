package com.bvha.billing.persistence.dao;

import com.bvha.billing.persistence.SQLConnectionFactory;
import org.apache.ibatis.session.SqlSession;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class DashboardDAO{

<<<<<<< HEAD
	public Map getCompletionRate(long periodId) throws Exception{
		Map data = null;
		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			data = session.selectOne("com.bvha.billing.persistence.mapper.dashboard.BillCompletionRate", periodId);
=======
	public List<Map> getCompletionRate(long periodId) throws Exception{
		List<Map> data = null;
		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			data = session.selectList("com.bvha.billing.persistence.mapper.dashboard.BillCompletionRate", periodId);
>>>>>>> 5ba8a94e650f33db98e4cc99b5de5e4985ecc6d1
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

<<<<<<< HEAD
	public List<Map> getOutstanding(long periodId) throws Exception{
		List<Map> data = null;
		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			data = session.selectList("com.bvha.billing.persistence.mapper.dashboard.OutstandingMembers", periodId);
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}

		return data;
	}
	public List<Map> getDeliquent(long periodId) throws Exception{
		List<Map> data = null;
		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			data = session.selectList("com.bvha.billing.persistence.mapper.dashboard.DeliquentMembers", periodId);
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}

		return data;
	}

=======
>>>>>>> 5ba8a94e650f33db98e4cc99b5de5e4985ecc6d1
}