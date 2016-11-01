package com.bvha.billing.persistence.core;

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
 


public class SQLConnectionFactory {

	private static SqlSessionFactory sqlSessionFactory;
	private static final String resource = "/persistence/mybatis-config.xml";

	public static SqlSessionFactory getSession() throws Exception{
		if(sqlSessionFactory == null){
			try(Reader reader = Resources.getResourceAsReader(resource)){
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}catch(Exception e){
				throw e;
			}
		}

		return sqlSessionFactory;
	}
}
