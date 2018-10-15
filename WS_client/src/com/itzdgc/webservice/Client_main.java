package com.itzdgc.webservice;

import com.itzdgc.webservice.serviceimpl.HelloWorldImpl;
import com.itzdgc.webservice.serviceinterface.Cat;
import com.itzdgc.webservice.serviceinterface.Data;
import com.itzdgc.webservice.serviceinterface.Entry;
import com.itzdgc.webservice.serviceinterface.HelloWorld;

public class Client_main {
    public static void main(String[] args) {
        HelloWorldImpl fac = new HelloWorldImpl();
        HelloWorld hw = fac.getHelloWorldImplPort();

        Data d = hw.getAllCats();
        for(Entry entry :d.getEntries()){
            System.out.println(entry.getKey()+"=========="+entry.getValue().getCatName());
        }
    }
}
