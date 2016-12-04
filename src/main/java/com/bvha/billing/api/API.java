package com.bvha.billing.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.StringWriter;
import java.io.PrintWriter;
import com.bvha.billing.api.dto.Response;
import com.bvha.billing.api.dto.MapListResponse;
import com.bvha.billing.api.dto.StringListResponse;
import com.bvha.billing.api.dto.MapResponse;
import java.util.List;
import java.util.Map;


public abstract class API{

	private final Logger logger = LogManager.getLogger(this.getClass());
    private final String SUCCESS = "SUCCESS";

    public Response handleException(Exception e, Response response){
        if(e != null){
        	StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            response.setResponseMessage(sw.toString());
        }else{
        	response.setResponseMessage("FAIL");
        }
        response.setResponseStatus(0);

        return response;
    }

    public Response handleSuccess(Response response){
        response.setResponseMessage(SUCCESS);
        response.setResponseStatus(1);
        return response;
    }

    public MapResponse handleSuccessMap(Map result){
        return (MapResponse) handleSuccess(new MapResponse(result));
    }

    public StringListResponse handleSuccessListString(List<String> result){
        return (StringListResponse) handleSuccess(new StringListResponse(result));
    }

    public MapListResponse handleSuccessMapList(List<Map> result){
        return (MapListResponse) handleSuccess(new MapListResponse(result));
    }


}