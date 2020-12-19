package com.tms.lesson7.task2.jackets;

public class DenimJacket implements IJacket {
    @Override
    public void pullOff() {
        System.out.println("Снял джинсовку");
    }

    @Override
    public void putOn() {
        System.out.println("Надел джинсовку");
    }
}
