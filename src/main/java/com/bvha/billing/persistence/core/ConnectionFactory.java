package main.java.com.bvha.billing.persistence;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
 


public class ConnectionFactory {

	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;
	private final String resource = "../mybatis-config.xml";

	static{
		try(InputStream inputStream = ResourceBundle.getResourceAsStream(resource)){
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		}catch(Exception e){
			e.printStackTrace();
		}
	}


	public static SqlSessionFactory getSessoithn(){
		return sqlSessionFactory;
	}
}
