package com.at.designpattern.memento;

import lombok.Data;

/**
 * @author zero
 * @create 2020-11-20 21:32
 */
//需要保存状态的对象
@Data
public class Originator implements Cloneable {

    //状态信息
    private String state;

    //保存 状态对象Memento
    public Memento saveMemento(){
        return new Memento(state);
    }

    //恢复状态
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
