package com.lepet;

import java.util.Map;

public class Request {
    private Map<String, String> form;
    private Map<String, String> headers;

    @Override
    public String toString() {
        return "Request{" +
                "form=" + form +
                ", headers=" + headers +
                '}';
    }
}
