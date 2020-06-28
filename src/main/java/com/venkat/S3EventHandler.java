package com.venkat;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;

import java.time.LocalDate;

public class S3EventHandler implements RequestHandler<S3Event,String> {

    public String handleRequest(S3Event s3event, Context context) {
        context.getLogger().log("s3 event \n" + LocalDate.now());
        context.getLogger().log("s3 + " + s3event.getRecords().get(0).getS3().getObject().getKey());
        return "ok";
    }
}
