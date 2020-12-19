package com.tms.lesson7.task2.trousers;

public class Chinos implements ITrousers {
    @Override
    public void pullOff() {
        System.out.println("Снял чиносы");
    }

    @Override
    public void putOn() {
        System.out.println("Надел чиносы");
    }
}
