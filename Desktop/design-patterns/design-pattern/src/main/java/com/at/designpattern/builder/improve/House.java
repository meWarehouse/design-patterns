package com.at.designpattern.builder.improve;

import lombok.Data;

/**
 * @author zero
 * @create 2020-11-18 10:29
 *
 * 产品
 *
 */
@Data
public abstract class House {

    private String base;
    private String walls;
    private String roofed;

}
