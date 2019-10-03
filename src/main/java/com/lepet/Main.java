package com.lepet;

import com.google.gson.Gson;

public class Main {
    private static final String URL = "https://postman-echo.com/post";
    private static final String body = "foo1=bar1&foo2=bar2";
    public static void main(String[] args) {
        Gson gson = new Gson();
        String response = HttpUtil.sendRequest(URL,null,body);
        Request request = gson.fromJson(response,Request.class);
        System.out.println(request);

    }
}
