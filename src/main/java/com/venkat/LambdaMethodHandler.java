package com.venkat;

import com.amazonaws.services.lambda.runtime.Context;
import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.io.OutputStream;

public class LambdaMethodHandler {
    public void handleRequest(InputStream inputStream,
                                OutputStream outputStream, Context context) throws Exception {
        String input = IOUtils.toString(inputStream, "UTF-8");
        outputStream.write(("Hello World - " + input).getBytes());
        context.getLogger().log("log 2\n");
    }
}
