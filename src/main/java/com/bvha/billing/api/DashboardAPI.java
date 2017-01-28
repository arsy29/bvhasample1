package com.bvha.billing.api;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import com.bvha.billing.persistence.dao.DashboardDAO;
import com.bvha.billing.api.dto.Response;
import com.bvha.billing.api.dto.MapListResponse;
import com.bvha.billing.api.dto.MapResponse;
import com.bvha.billing.api.API;


@Path("/dashboard")
public class DashboardAPI extends API{

	private DashboardDAO dashboardDAO;

	private DashboardDAO getService(){
		if(this.dashboardDAO == null){
			this.dashboardDAO = new DashboardDAO();
		}
		return this.dashboardDAO;
	}

	@GET @Path("/completion-rate/{periodId}")
	@Produces(MediaType.APPLICATION_JSON)
	public MapResponse billingCompletionRate(@PathParam("periodId") String periodId){
		try{
			return handleSuccessMap(getService().getCompletionRate(Long.parseLong(periodId)));
		}catch(Exception e){
			return (MapResponse)handleException(e, new MapResponse());
		}
	}
	@GET @Path("/completion-graph/{periodId}")
	@Produces(MediaType.APPLICATION_JSON)
	public MapListResponse billingCompletionGraph(@PathParam("periodId")String periodId){
		try{
			return handleSuccessMapList(getService().getCompletionGraph(Long.parseLong(periodId)));
		}catch(Exception e){
			return (MapListResponse)handleException(e, new MapListResponse());
		}
	}
	@GET @Path("/collection-graph/{periodId}")
	@Produces(MediaType.APPLICATION_JSON)
	public MapListResponse CollectionGraph(@PathParam("periodId")String periodId){
		try{
			return handleSuccessMapList(getService().getCollectionGraph(Long.parseLong(periodId)));
		}catch(Exception e){
			return (MapListResponse)handleException(e, new MapListResponse());
		}
	}
	@GET @Path("/outstanding/{periodId}")
	@Produces(MediaType.APPLICATION_JSON)
	public MapListResponse outstandingMembers(@PathParam("periodId")String periodId){
		try{
			return handleSuccessMapList(getService().getOutstanding(Long.parseLong(periodId)));
		}catch(Exception e){
			return (MapListResponse)handleException(e, new MapListResponse());
		}
	}
	@GET @Path("/delinquent/{periodId}")
	@Produces(MediaType.APPLICATION_JSON)
	public MapListResponse delinquentMembers(@PathParam("periodId")String periodId){
		try{
			return handleSuccessMapList(getService().getDeliquent(Long.parseLong(periodId)));
		}catch(Exception e){
			return (MapListResponse)handleException(e, new MapListResponse());
		}
	}
}