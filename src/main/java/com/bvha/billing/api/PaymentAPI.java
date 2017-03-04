package com.bvha.billing.api;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import java.util.Map;
import com.bvha.billing.persistence.dao.PaymentDAO;
import com.bvha.billing.api.dto.Response;
import com.bvha.billing.api.dto.MapListResponse;
import com.bvha.billing.api.dto.StringListResponse;
import com.bvha.billing.api.dto.MapResponse;
import com.bvha.billing.api.API;

/**
 * Root resource (exposed at "BillingAPI" path)
 */
@Path("/payment")
public class PaymentAPI extends API{

	private PaymentDAO paymentDao;


	private PaymentDAO getService(){
		if(paymentDao == null){
			paymentDao = new PaymentDAO();
		}
		return paymentDao;
	}

	@GET @Path("/payments/{billingId}")
	@Produces(MediaType.APPLICATION_JSON)
	public MapListResponse paymentByBillingID(@PathParam("billingId") String billingId){
		try{
			return handleSuccessMapList(getService().getPaymentByBillingId(Long.parseLong(billingId)));
		}catch(Exception e){
			return (MapListResponse) handleException(e, new MapListResponse());
		}
	}

	@GET @Path("/delete/{paymentId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deletePaymentById(@PathParam("paymentId") String paymentId){
		try{
			if(getService().deletePaymentById(Long.parseLong(paymentId)) > 0){
				return handleSuccess(new Response());
			}else{
				return handleException(null, new Response());
			}
		}catch(Exception e){
			return handleException(e, new Response());
		}
	}

	
	@POST @Path("/persist")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addUpdatePaymentDetails(Map response){
		try{
			if(getService().addUpdatePaymentDetails(response) > 0){
				return handleSuccess(new Response());
			}else{
				return handleException(null, new Response());
			}
		}catch(Exception e){
			return handleException(e, new Response());
		}
	}

	@GET @Path("/paymentsByPeriod/{periodId}")
	@Produces(MediaType.APPLICATION_JSON)
	public MapListResponse paymentsByPeriod(@PathParam("periodId") String periodId){
		try{
			return handleSuccessMapList(getService().getPaymentByPeriodId(Long.parseLong(periodId)));
		}catch(Exception e){
			return (MapListResponse) handleException(e, new MapListResponse());
		}
	}
}