package com.example.demo.designPattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.memento
 * @date 2022-10-13 20:14
 */
public class CareMaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
