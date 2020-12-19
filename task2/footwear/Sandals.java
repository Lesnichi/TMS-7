package com.tms.lesson7.task2.footwear;

public class Sandals implements IFootwear {
    @Override
    public void pullOff() {
        System.out.println("Снял сандали");
    }

    @Override
    public void putOn() {
        System.out.println("Надел сандали");
    }
}
