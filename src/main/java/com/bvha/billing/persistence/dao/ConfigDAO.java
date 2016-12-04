package com.bvha.billing.persistence.dao;

import com.bvha.billing.persistence.core.SQLConnectionFactory;
import org.apache.ibatis.session.SqlSession;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class ConfigDAO {

	public List<Map> getBreakdown(long groupId) throws Exception{
		List<Map> result = null;

		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			result = session.selectList("com.bvha.billing.persistence.mapper.config.Breakdown", groupId);
		}catch(Exception e){
			throw e;
		}

		return result;
	}

	public  List<Map> getDefaults() throws Exception{
		 List<Map> result = null;

		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			result = session.selectList("com.bvha.billing.persistence.mapper.config.Defaults");
		}catch(Exception e){
			throw e;
		}

		return result;
	}
}