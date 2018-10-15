package com.itzdgc.webservice.serviceInterface;

import com.itzdgc.webservice.domain.Cat;
import com.itzdgc.webservice.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<Cat> getCatsByUser(User user);
    Map<String,Cat> getAllCats();

}
