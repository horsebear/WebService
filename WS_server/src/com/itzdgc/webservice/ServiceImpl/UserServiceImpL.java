package com.itzdgc.webservice.ServiceImpl;

import com.itzdgc.webservice.domain.Cat;
import com.itzdgc.webservice.domain.User;
import com.itzdgc.webservice.serviceInterface.UserService;
import org.junit.Test;

import java.util.*;

public class UserServiceImpL implements UserService {

    //使用hashMap模拟数据库
    static Map<User,List<Cat>> catDb = new HashMap<>();
    static{
        List<Cat> catList1 = new ArrayList<Cat>();
        catList1.add(new Cat(1,"garfield","红色"));
        catList1.add(new Cat(2,"机器猫","蓝色"));
        catDb.put(new User(1,"孙悟空","123456","花果山"),catList1);

        List<Cat> catList2 = new ArrayList<Cat>();
        catList2.add(new Cat(3,"Kitty","白色"));
        catList2.add(new Cat(4,"叮当猫","天蓝色"));
        catDb.put(new User(2,"猪八戒","123","高老庄"),catList2);
    }
    @Override
    public List<Cat> getCatsByUser(User user) {
        return catDb.get(user);
    }

    @Override
    public Map<String, Cat> getAllCats() {
       Map<String,Cat> result = new HashMap<>();
        int i=1;
        for(List<Cat> cats:catDb.values()){
            for(Cat cat:cats){
                result.put("第"+ i++ +"个",cat);
            }
        }

        return result;
    }

}
