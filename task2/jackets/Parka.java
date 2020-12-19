package com.tms.lesson7.task2.jackets;

public class Parka implements IJacket {
    @Override
    public void pullOff() {
        System.out.println("Снял парку");
    }

    @Override
    public void putOn() {
        System.out.println("Надел парку");
    }
}
