package com.itzdgc.webservice.serviceInterface;

import com.itzdgc.webservice.domain.Cat;
import com.itzdgc.webservice.domain.User;
import com.itzdgc.webservice.transfer.FkXmlAdapter;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;
import java.util.Map;

@WebService
public interface    HelloWorld {
    String sysHi(String name);
    List<Cat> getCatsByUser(User user);
    //CXF不能处理Map<Strign,Cat>类型，于是采用指定FkXmlAdapter进行转换处理
   @XmlJavaTypeAdapter
  (FkXmlAdapter.class) Map<String,Cat> getAllCats();
}


















