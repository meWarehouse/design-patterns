package com.at.design.webflux.service;

import com.at.design.webflux.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author zero
 * @create 2020-11-22 18:53
 */
public interface UserService {

    //通过id获取一个user
    Mono<User> getUserById(Integer id);

    //添加一个user
    Mono<Void> addUser(Mono<User> user);

    //获取所有的user
    Flux<User> getAllUser();

}
