package com.at.design.webflux.reactor8;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Observable;

/**
 * @author zero
 * @create 2020-11-22 16:43
 */
public class Reactor8Demo extends Observable {
    public static void main(String[] args) {

        Reactor8Demo reactor8Demo = new Reactor8Demo();

        //添加一个观察者
//        reactor8Demo.addObserver((o,var)->{
//            System.out.println("发生了变化");
//        });
//        reactor8Demo.addObserver((o,var)->{
//            System.out.println("发生了变化、、、、、、、、");
//        });
//
//
//        reactor8Demo.setChanged();
//        reactor8Demo.notifyObservers();


        Flux.just(1,2,3).subscribe(System.out::println);
        Mono.just(1).subscribe(System.out::print);

//        Flux.fromArray();
//        Flux.fromIterable();
//        Flux.fromStream();


        //Flux<Object> error = Flux.error();




    }
}
