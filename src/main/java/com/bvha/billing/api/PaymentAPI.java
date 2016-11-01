package com.bvha.billing.api;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
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


	private PaymentDAO getPaymentDao(){
		if(paymentDao == null){
			paymentDao = new PaymentDAO();
		}
		return paymentDao;
	}

	@GET @Path("/payments/{billingId}")
	@Produces(MediaType.APPLICATION_JSON)
	public MapListResponse paymentByBillingID(@PathParam("billingId") String billingId){
		try{
			return handleSuccessMapList(getPaymentDao().getPaymentByBillingId(Long.parseLong(billingId)));
		}catch(Exception e){
			return (MapListResponse) handleException(e, new MapListResponse());
		}
	}
}