package com.tms.lesson7.task2.trousers;

public class Joggers implements ITrousers {
    @Override
    public void pullOff() {
        System.out.println("Снял джогеры");
    }

    @Override
    public void putOn() {
        System.out.println("Надел джогеры");
    }
}
