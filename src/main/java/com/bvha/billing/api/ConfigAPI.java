package com.bvha.billing.api;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import com.bvha.billing.persistence.dao.ConfigDAO;
import com.bvha.billing.api.dto.Response;
import com.bvha.billing.api.dto.MapListResponse;
import com.bvha.billing.api.dto.StringListResponse;
import com.bvha.billing.api.dto.MapListResponse;
import com.bvha.billing.api.API;

/**
 * Root resource (exposed at "BillingAPI" path)
 */
@Path("/config")
public class ConfigAPI extends API{


    private ConfigDAO dao;
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    private ConfigDAO getService(){
        if(dao == null){
            dao = new ConfigDAO();
        }
        return dao;
    }

    @GET @Path("/breakdown/{groupId}")
    @Produces(MediaType.APPLICATION_JSON)
    public MapListResponse billingDetails(@PathParam("groupId") String periodId) {
        try{
           return handleSuccessMapList(getService().getBreakdown(Long.parseLong(periodId)));
        }catch(Exception e){
           return (MapListResponse)handleException(e, new MapListResponse());
        }
    }

    @GET @Path("/defaults")
    @Produces(MediaType.APPLICATION_JSON)
    public MapListResponse billingDetails() {
        try{
           return handleSuccessMapList(getService().getDefaults());
        }catch(Exception e){
           return (MapListResponse)handleException(e, new MapListResponse());
        }
    }


    // @GET @Path("/periodYear")
    // @Produces(MediaType.APPLICATION_JSON)
    // public StringListResponse periodYear(){
    //     try{
    //         return handleSuccessListString(getService().getPeriodYear());
    //     }catch(Exception e){
    //         return (StringListResponse)handleException(e, new StringListResponse());
    //     }
    // }

    // @GET @Path("/periodByYear/{yearId}")
    // @Produces(MediaType.APPLICATION_JSON)
    // public MapListResponse period(@PathParam("yearId") String yearId){
    //     try{
    //         return handleSuccessMapList(getService().getPeriodByYear(yearId));
    //     }catch(Exception e){
    //         return (MapListResponse)handleException(e, new MapListResponse());
    //     }
    // }

    // @GET @Path("/memberBillList/{periodId}")
    // @Produces(MediaType.APPLICATION_JSON)
    // public MapListResponse memberList(@PathParam("periodId") String periodId){
    //     try{
    //         return handleSuccessMapList(getService().getMemberBillList(Long.parseLong(periodId)));
    //     }catch(Exception e){
    //         return (MapListResponse)handleException(e, new MapListResponse());
    //     }
    // }



}
