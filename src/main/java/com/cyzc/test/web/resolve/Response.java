package com.cyzc.test.web.resolve;

import java.util.HashMap;

public class Response extends HashMap<String, Object> {


    private Response() {

    }

    private Response(ResponseCode responseCode) {
        this.put("code", responseCode.getCode());
        this.put("msg", responseCode.getMsg());
    }


    public static Response success() {
        return new Response(ResponseCode.SUCCESS);
    }

    public static Response success(Object data) {
        return success().data(data);
    }

    public static Response success(Object data, Object ext) {
        return success().data(data, ext);
    }

    private Response data(Object data) {
        put("data", data);
        return this;
    }

    private Response data(Object data, Object ext) {
        put("data", data);
        put("ext", ext);
        return this;
    }

    public static Response error(ResponseCode responseCode) {
        return new Response(responseCode);
    }


}


