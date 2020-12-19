package com.tms.lesson7.task2.jackets;

public class Raincoat implements IJacket {
    @Override
    public void pullOff() {
        System.out.println("Снял дождевик");
    }

    @Override
    public void putOn() {
        System.out.println("Надел дождевик");

    }
}
