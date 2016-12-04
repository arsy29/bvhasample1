package com.bvha.billing.api;

import java.util.Map;
import java.util.HashMap;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import com.bvha.billing.persistence.dao.MemberDAO;
import com.bvha.billing.api.dto.Response;
import com.bvha.billing.api.dto.MapListResponse;
import com.bvha.billing.api.dto.StringListResponse;
import com.bvha.billing.api.dto.MapResponse;
import com.bvha.billing.api.API;

/**
 * Root resource (exposed at "BillingAPI" path)
 */
@Path("/member")
public class MemberAPI extends API{

	private MemberDAO memberDAO;


	private MemberDAO getService(){
		if(memberDAO == null){
			memberDAO = new MemberDAO();
		}
		return memberDAO;
	}

	@GET @Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public MapListResponse memberList(){
		try{
			return handleSuccessMapList(getService().getMemberList());
		}catch(Exception e){
			return (MapListResponse)handleException(e, new MapListResponse());
		}
	}

	@POST @Path("/persist")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public MapResponse addUpdateMemberDetails(Map response){
		try{
			long result = getService().addUpdateMemberDetails(response);
			if(result > 0){
				return handleSuccessMap(response);
			}else{
				return (MapResponse)handleException(null, new MapResponse());
			}
		}catch(Exception e){
			return (MapResponse)handleException(e, new MapResponse());
		}
	}

	@GET @Path("/contact/list/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public MapListResponse memberList(@PathParam("id") long id){
		try{
			return handleSuccessMapList(getService().getContactList(id));
		}catch(Exception e){
			return (MapListResponse)handleException(e, new MapListResponse());
		}
	}

	@POST @Path("/contact/persist")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addUpdateContact(Map response){
		try{
			if(getService().addUpdateContact(response) > 0){
				return handleSuccess(new Response());
			}else{
				return handleException(null, new Response());
			}
		}catch(Exception e){
			return handleException(e, new Response());
		}
	}

	@GET @Path("/contact/delete/{contactId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteContactById(@PathParam("contactId") String contactId){
		try{
			if(getService().deleteContactById(Long.parseLong(contactId)) > 0){
				return handleSuccess(new Response());
			}else{
				return handleException(null, new Response());
			}
		}catch(Exception e){
			return handleException(e, new Response());
		}
	}


}