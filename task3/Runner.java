package com.tms.lesson7.task3;

public class Runner {
    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();
        cosmodrome.launch(new Shuttle());
        cosmodrome.launch(new SpaceX());
    }
}
