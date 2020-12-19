package com.tms.lesson7.task2.trousers;

public class WoolTrousers implements ITrousers {
    @Override
    public void pullOff() {
        System.out.println("Снял шерстяные брюки");
    }

    @Override
    public void putOn() {
        System.out.println("Надел шерстяные брюки");
    }
}
