package com.itzdgc.webservice.MianProcedure;

import com.itzdgc.webservice.ServiceImpl.HelloWorldImpl;
import com.itzdgc.webservice.serviceInterface.HelloWorld;

import javax.xml.ws.Endpoint;

public class ServiceMain {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorldImpl();
        //调用Endpoint.publish方法发布WebService
        Endpoint.publish("http://192.168.1.105:9888/maxiong",hello);
        System.out.println("WebService 接口暴露成功！");
    }
}
