package com.tms.lesson7.task2.footwear;

public class Boots implements IFootwear {
    @Override
    public void pullOff() {
        System.out.println("Снял ботинки");
    }

    @Override
    public void putOn() {
        System.out.println("Надел ботинки");
    }
}
