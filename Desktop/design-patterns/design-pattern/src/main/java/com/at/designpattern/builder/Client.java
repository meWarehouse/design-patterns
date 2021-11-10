package com.at.designpattern.builder;

/**
 * @author zero
 * @create 2020-11-18 10:08
 *
 * 1) 需要建房子：这一过程为打桩、砌墙、封顶
 * 2) 房子有各种各样的，比如普通房，高楼，别墅，各种房子的过程虽然一样，但是 要求不要相同的.
 */
public class Client {
    public static void main(String[] args) {

        AbsHoust houst = new CommonHouse();

        houst.building();

    }
}
