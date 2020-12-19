package com.tms.lesson7.task2;

import com.tms.lesson7.task2.footwear.Boots;
import com.tms.lesson7.task2.footwear.Sandals;
import com.tms.lesson7.task2.footwear.Sneakers;
import com.tms.lesson7.task2.jackets.DenimJacket;
import com.tms.lesson7.task2.jackets.Parka;
import com.tms.lesson7.task2.jackets.Raincoat;
import com.tms.lesson7.task2.trousers.Chinos;
import com.tms.lesson7.task2.trousers.Joggers;
import com.tms.lesson7.task2.trousers.WoolTrousers;

public class RunnerClothes {
    public static void main(String[] args) {
        Person person1 = new Person("Tom", new Boots(), new DenimJacket(), new Chinos());
        Person person2 = new Person("Sam", new Sandals(), new Parka(), new Joggers());
        Person person3 = new Person("Sean", new Sneakers(), new Raincoat(), new WoolTrousers());

        person1.dressOn();
        person2.dressOn();
        person3.dressOn();

        person1.dressOut();
        person2.dressOut();
        person3.dressOut();
    }
}
