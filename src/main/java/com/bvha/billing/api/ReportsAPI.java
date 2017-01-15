package com.bvha.billing.api;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.bvha.billing.persistence.dao.ReportsDAO;
import com.bvha.billing.api.API;
import com.bvha.billing.reports.PDFGenerator;
import com.bvha.billing.reports.helper.BillingStatementHelper;
import javax.ws.rs.core.Response.ResponseBuilder;
import java.io.ByteArrayInputStream;

/**
 * Root resource (exposed at "BillingAPI" path)
 */
@Path("/reports")
public class ReportsAPI extends API{

  private final String BILLING_STATEMENT = "/jasper/billing_statement.jasper";

    private ReportsDAO dao;
    private BillingStatementHelper billingStatementHelper;
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    private ReportsDAO getService(){
        if(dao == null){
            dao = new ReportsDAO();
        }
        return dao;
    }

    private BillingStatementHelper getBillingStatementHelper(){
      if(billingStatementHelper == null){
        billingStatementHelper = new BillingStatementHelper();
      }

      return billingStatementHelper;
    }


    @POST @Path("/billing-statement")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("application/pdf")
    public Response billingStatement(Map map) throws Exception{
        ResponseBuilder response = null;
        try{
          List<Map> memberList;
          if(map.get("list") == null){
             memberList = getService().getBillAll(map);
          }
          else{
            memberList = getService().getBill(map);
          }
           byte[] pdf = new PDFGenerator(getBillingStatementHelper().transformToDataSource(memberList), map, BILLING_STATEMENT).getPDF();
           ByteArrayInputStream inputStream = new ByteArrayInputStream( pdf );
           response = Response.ok((Object) inputStream);
           response.type("application/pdf");
           response.header("Content-Disposition",  "filename=billing_statement");
        }catch(Exception e){
            throw e;
        }
       return response.build();
    } 

 



}
