package com.bvha.billing.persistence.dao;

import com.bvha.billing.persistence.SQLConnectionFactory;
import org.apache.ibatis.session.SqlSession;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class MemberDAO {

	public List<Map> getMemberList() throws Exception{
		List<Map> memberList = null;

		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			memberList = session.selectList("com.bvha.billing.persistence.mapper.member.MemberList");
		}catch(Exception e){
			throw e;
		}

		return memberList;
	}

	public int addUpdateMemberDetails(Map row) throws Exception {
		int result = 0;
		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			if(row.containsKey("id")){
				result = session.update("com.bvha.billing.persistence.mapper.member.UpdateMember", row);
			}else{
				result = session.insert("com.bvha.billing.persistence.mapper.member.AddMember", row);
			}
			session.commit();
		}catch(Exception e){
			throw e;
		}
		return result;
	}

	public List<Map> getContactList(long id) throws Exception{
		List<Map> contact = null;

		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			contact = session.selectList("com.bvha.billing.persistence.mapper.member.ContactList",id);
		}catch(Exception e){
			throw e;
		}

		return contact;
	}

	public int addUpdateContact(Map row) throws Exception {
		int result = 0;
		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			if(row.containsKey("id")){
				result = session.update("com.bvha.billing.persistence.mapper.member.UpdateContact", row);
			}else{
				result = session.insert("com.bvha.billing.persistence.mapper.member.AddContact", row);
			}
			session.commit();
		}catch(Exception e){
			throw e;
		}
		return result;
	}

	public int deleteContactById( Long id) throws Exception{
		int result = 0;
		try(SqlSession session = SQLConnectionFactory.getSession().openSession()){
			result = session.delete("com.bvha.billing.persistence.mapper.member.DeleteContact", id);
			session.commit();
		}catch(Exception e){
			throw e;
		}
		return result;
	} 
}