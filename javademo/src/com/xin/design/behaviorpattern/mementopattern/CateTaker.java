package com.xin.design.behaviorpattern.mementopattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: CateTaker
 * @create: 2023-09-15 14:00
 **/
public class CateTaker {
    private final int maxSize = 3;
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
        while (mementoList.size() > 3) {
            mementoList.remove(0);
        }
    }

    public Memento get(int index) {
        return index >= mementoList.size() ? mementoList.get(mementoList.size() - 1) : mementoList.get(index);
    }
}
