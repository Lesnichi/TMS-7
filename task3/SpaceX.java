package com.tms.lesson7.task3;

import java.util.Random;

public class SpaceX implements IStart {
    @Override
    public boolean checkSystem() {
        Random random = new Random();
        int temp = random.nextInt(2);
        if (temp == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void startMachine() {
        System.out.println("SpaceX улетел в космос как и его акции)))");
    }
}
