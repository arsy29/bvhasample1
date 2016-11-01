package com.bvha.billing.api;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import com.bvha.billing.persistence.dao.BillingDAO;
import com.bvha.billing.api.dto.Response;
import com.bvha.billing.api.dto.MapListResponse;
import com.bvha.billing.api.dto.StringListResponse;
import com.bvha.billing.api.dto.MapResponse;
import com.bvha.billing.api.API;

/**
 * Root resource (exposed at "BillingAPI" path)
 */
@Path("/billing")
public class BillingAPI extends API{


    private BillingDAO billingDao;
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    private BillingDAO getBillingDao(){
        if(billingDao == null){
            billingDao = new BillingDAO();
        }
        return billingDao;
    }

    @GET @Path("/details/{periodId}/{memberId}")
    @Produces(MediaType.APPLICATION_JSON)
    public MapResponse billingDetails(@PathParam("periodId") String periodId, @PathParam("memberId") String memberId) {
        try{
           return handleSuccessMap(getBillingDao().getBillingDetails(Long.parseLong(periodId),Long.parseLong(memberId)));
        }catch(Exception e){
           return (MapResponse)handleException(e, new MapResponse());
        }
    }


    @GET @Path("/periodYear")
    @Produces(MediaType.APPLICATION_JSON)
    public StringListResponse periodYear(){
        try{
            return handleSuccessListString(getBillingDao().getPeriodYear());
        }catch(Exception e){
            return (StringListResponse)handleException(e, new StringListResponse());
        }
    }

    @GET @Path("/periodByYear/{yearId}")
    @Produces(MediaType.APPLICATION_JSON)
    public MapListResponse period(@PathParam("yearId") String yearId){
        try{
            return handleSuccessMapList(getBillingDao().getPeriodByYear(yearId));
        }catch(Exception e){
            return (MapListResponse)handleException(e, new MapListResponse());
        }
    }

    @GET @Path("/memberBillList/{periodId}")
    @Produces(MediaType.APPLICATION_JSON)
    public MapListResponse memberList(@PathParam("periodId") String periodId){
        try{
            return handleSuccessMapList(getBillingDao().getMemberBillList(Long.parseLong(periodId)));
        }catch(Exception e){
            return (MapListResponse)handleException(e, new MapListResponse());
        }
    }



}
