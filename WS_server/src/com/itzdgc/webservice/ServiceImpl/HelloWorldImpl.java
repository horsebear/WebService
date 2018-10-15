package com.itzdgc.webservice.ServiceImpl;

import com.itzdgc.webservice.domain.Cat;
import com.itzdgc.webservice.domain.User;
import com.itzdgc.webservice.serviceInterface.HelloWorld;
import com.itzdgc.webservice.serviceInterface.UserService;

import javax.jws.WebService;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@WebService(endpointInterface ="com.itzdgc.webservice.serviceInterface.HelloWorld" ,serviceName = "HelloWorldImpl")
public class HelloWorldImpl  implements HelloWorld {
    @Override
    public String sysHi(String name) {
        return name + "你好 ，现在时间是" +new Date();
    }

    @Override
    public List<Cat> getCatsByUser(User user) {

        //在实际的项目主中，Web Service 组件并不会去实现业务功能，他只是调用业务逻辑组件的方法来暴露Web service
        UserService us = new UserServiceImpL();
        return us.getCatsByUser(user);
    }

    @Override
    public Map<String, Cat> getAllCats() {
        UserService us = new UserServiceImpL();
        return us.getAllCats();
    }


}













