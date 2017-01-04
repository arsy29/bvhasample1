package com.bvha.billing.api;


import java.util.Map;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
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
    private BillingDAO getService(){
        if(billingDao == null){
            billingDao = new BillingDAO();
        }
        return billingDao;
    }

    @GET @Path("/details/{periodId}/{memberId}")
    @Produces(MediaType.APPLICATION_JSON)
    public MapResponse billingDetails(@PathParam("periodId") String periodId, @PathParam("memberId") String memberId) {
        try{
           return handleSuccessMap(getService().getBillingDetails(Long.parseLong(periodId),Long.parseLong(memberId)));
        }catch(Exception e){
           return (MapResponse)handleException(e, new MapResponse());
        }
    }


    @GET @Path("/periodYear")
    @Produces(MediaType.APPLICATION_JSON)
    public StringListResponse periodYear(){
        try{
            return handleSuccessListString(getService().getPeriodYear());
        }catch(Exception e){
            return (StringListResponse)handleException(e, new StringListResponse());
        }
    }

    @GET @Path("/periodByYear/{yearId}")
    @Produces(MediaType.APPLICATION_JSON)
    public MapListResponse period(@PathParam("yearId") String yearId){
        try{
            return handleSuccessMapList(getService().getPeriodByYear(yearId));
        }catch(Exception e){
            return (MapListResponse)handleException(e, new MapListResponse());
        }
    }

    @GET @Path("/memberBillList/{periodId}")
    @Produces(MediaType.APPLICATION_JSON)
    public MapListResponse memberList(@PathParam("periodId") String periodId){
        try{
            return handleSuccessMapList(getService().getMemberBillList(Long.parseLong(periodId)));
        }catch(Exception e){
            return (MapListResponse)handleException(e, new MapListResponse());
        }
    }

    @GET @Path("/generate")
    @Produces(MediaType.APPLICATION_JSON)
    public MapResponse generateBilling(){
        try{
            return handleSuccessMap(getService().generateBilling());
        }catch(Exception e){
            return (MapResponse)handleException(e, new MapResponse());
        }
    }

    @GET @Path("/checkForDraft")
    @Produces(MediaType.APPLICATION_JSON)
    public MapResponse checkForDraft(){
        try{
            return handleSuccessMap(getService().checkForDraft());
        }catch(Exception e){
            return (MapResponse)handleException(e, new MapResponse());
        }
    }

    @POST @Path("/Submit")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response submit(Map response){
        try{
            if(getService().submit(response) > 0){
                return handleSuccess(new Response());
            }else{
                return handleException(null, new Response());
            }
        }catch(Exception e){
            return handleException(e, new Response());
        }
    }


}
