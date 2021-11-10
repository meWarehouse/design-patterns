package com.at.design.webflux.handler;

import com.at.design.webflux.entity.User;
import com.at.design.webflux.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;
import static org.springframework.web.reactive.function.BodyInserters.fromValue;

/**
 * @author zero
 * @create 2020-11-22 19:50
 */
public class UserHandler {

    private UserService userService;

    public UserHandler(UserService userService) {
        this.userService = userService;
    }

    public Mono<ServerResponse> getUserById(ServerRequest request) {
        // 获取 id 值
        int userId = Integer.valueOf(request.pathVariable("id"));
        // 空值处理
        Mono<ServerResponse> notFound = ServerResponse.notFound().build();
        // 调用 service 方法得到数据
        Mono<User> userMono = this.userService.getUserById(userId);
        // 把 userMono 进行转换返回
        //使用 Reactor 操作符 flatMap

        return userMono
                .flatMap(person -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(fromValue(person)))
                .switchIfEmpty(notFound);
    }

    public Mono<ServerResponse> getAllUsers(){
        Mono<ServerResponse> allUsers = this.getAllUsers();
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(allUsers,User.class);
    }

    public Mono<ServerResponse> saveUser(ServerRequest request){
        Mono<User> userMono = request.bodyToMono(User.class);
        return ServerResponse.ok().build(this.userService.addUser(userMono));
    }


}
