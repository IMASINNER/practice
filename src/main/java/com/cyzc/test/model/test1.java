package com.cyzc.test.model;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-08-02
 */
public class test1 {

    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("A Vehicle");
        Vehicle car=new Car("A car");
        System.out.println(vehicle.toString());
        System.out.println(car.toString());
    }

}