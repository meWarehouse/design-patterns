package com.at.design.webflux.controller;

import com.at.design.webflux.entity.User;
import com.at.design.webflux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author zero
 * @create 2020-11-22 19:04
 */
@RestController
public class Usercontroller {

    @Autowired
    UserService userService;

    //id单个
    @GetMapping("/user/{id}")
    public Mono<User> getUserById(@PathVariable("id") int id){
        return userService.getUserById(id);
    }

    //所有
    @GetMapping("/users")
    public Flux<User> getAllUser(){
        return userService.getAllUser();
    }

    //添加
    @PostMapping("/save")
    public Mono<Void> saveUser(@RequestBody User user){
        Mono<User> mono = Mono.just(user);
        return userService.addUser(mono);
    }



}
