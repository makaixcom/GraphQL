package com.makaix.graphql002.controller;

import com.makaix.graphql002.bean.vo.User;
import com.makaix.graphql002.bean.vo.Vehicle;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Controller
public class UserController {

//    @SchemaMapping(typeName = "Query", field = "hello")
    @QueryMapping
    String hello(){
        return "Hello World";
    }

    @QueryMapping
    String helloWithName(@Argument String name){
        return "hello " + name + "!";
    }

    @QueryMapping
    User userById(@Argument Integer id){
        return new User(id, Math.random() > .5 ?"马凯":"老马");
    }

    @QueryMapping
    List<User> users(){
        return List.of(
                new User(1, "makai"),
                new User(2, "lover")
        );
    }

    @QueryMapping
    Flux<User> users1(){
        List<User> users = List.of(
                new User(1, "makai"),
                new User(2, "lover")
        );
        return Flux.fromIterable(users);
    }

    @SchemaMapping(typeName = "User")
    Mono<Vehicle> vehicle(User user){
        return Mono.just(new Vehicle(user.id(), "豫A00001"));
    }


}
