package com.makaix.graphql001.service;

import com.makaix.graphql001.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public User getById(Integer id){
        return new User(id, "马凯");
    }

    public List<User> findAll(){
        return List.of(
                new User(1, "马凯"),
                new User(2, "马龙"),
                new User(3, "马雷")
        );
    }
}
