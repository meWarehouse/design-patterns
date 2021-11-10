package com.at.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zero
 * @create 2020-11-20 21:36
 */
//备忘录，保存历史记录
public class Caretaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento getHistoryMemento(int index){
        return mementoList.get(index);
    }

}
