package com.webservice;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class HelloService {
    public String Greeting(String name){
        System.out.println("Greeting method being called...");
        return "hello" + name;
    }

    public static void main(String[] args) {

        String address="http://127.1.0.1:8080/hello";
        Object implementor = new HelloService();
        Endpoint.publish(address, implementor);
    }
}
