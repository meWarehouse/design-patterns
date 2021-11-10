package com.at.designpattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author zero
 * @create 2020-11-17 23:13
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Sheep {

    private String name;
    private Integer age;
    private String color;

}
