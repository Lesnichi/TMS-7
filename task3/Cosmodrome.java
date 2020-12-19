package com.tms.lesson7.task3;

public class Cosmodrome {
    public void launch(IStart object) {
        if (object.checkSystem() != true) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            object.startEngine();
            for (int i = 10; i < 1; i++) {
                System.out.println(i);
            }
            object.startMachine();
        }

    }
}
