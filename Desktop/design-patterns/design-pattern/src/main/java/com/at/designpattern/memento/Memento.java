package com.at.designpattern.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zero
 * @create 2020-11-20 21:28
 */
//备忘录对象，负责保存记录
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
