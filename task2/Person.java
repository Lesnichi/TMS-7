package com.tms.lesson7.task2;

import com.tms.lesson7.task2.footwear.IFootwear;
import com.tms.lesson7.task2.jackets.IJacket;
import com.tms.lesson7.task2.trousers.ITrousers;

public class Person {
    private String name;
    private IFootwear footwear;
    private IJacket jacket;
    private ITrousers trousers;

    public Person(String name, IFootwear footwear, IJacket jacket, ITrousers trousers) {
        this.name = name;
        this.footwear = footwear;
        this.jacket = jacket;
        this.trousers = trousers;
    }

    public void dressOut() {
        System.out.println(name);
        footwear.pullOff();
        jacket.pullOff();
        trousers.pullOff();
    }

    public void dressOn() {
        System.out.println(name);
        footwear.putOn();
        jacket.putOn();
        trousers.putOn();
    }
}
