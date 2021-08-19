package com.cyzc.test.model;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-08-02
 */

public class Car extends Vehicle{


    public Car(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Car{}"+name;
    }
}