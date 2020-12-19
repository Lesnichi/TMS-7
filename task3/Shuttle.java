package com.tms.lesson7.task3;

import java.util.Random;

public class Shuttle implements IStart {
    @Override
    public boolean checkSystem() {
        Random random = new Random();
        int temp = random.nextInt(11);
        if (temp > 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шаттла запущены. Все системы в норме.");
    }

    @Override
    public void startMachine() {
        System.out.println("Шаттл запущен");
    }
}
