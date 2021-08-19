package com.cyzc.test.model;

import lombok.Data;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-08-02
 */
@Data
public class Vehicle {

    public String name;

    public Vehicle(String name) {
        this.name=name;
    }


    @Override
    public String toString() {
        return "Vehicle{}"+name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}