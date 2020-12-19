package com.tms.lesson7.task2.footwear;

public class Sneakers implements IFootwear {
    @Override
    public void pullOff() {
        System.out.println("Снял кросссовки");
    }

    @Override
    public void putOn() {
        System.out.println("Надел кроссовки");
    }
}
