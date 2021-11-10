package com.at.design.webflux.service.impl;

import com.at.design.webflux.entity.User;
import com.at.design.webflux.service.UserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.jnlp.IntegrationService;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zero
 * @create 2020-11-22 18:55
 */
@Service
public class UserServiceImpl implements UserService {

    private Map<Integer,User> users = new HashMap<>();

    public UserServiceImpl() {
        this.users.put(1,new User(1,"tom",0));
        this.users.put(2,new User(2,"jerry",1));
        this.users.put(3,new User(3,"jack",0));
    }

    @Override
    public Mono<User> getUserById(Integer id) {
        return Mono.justOrEmpty(this.users.get(id));
    }

    @Override
    public Mono<Void> addUser(Mono<User> user) {
        return user.doOnNext(p -> {
            int id = users.size()+1;
            users.put(id,p);
        }).thenEmpty(Mono.empty());
    }

    @Override
    public Flux<User> getAllUser() {
        return Flux.fromIterable(this.users.values());
    }
}
