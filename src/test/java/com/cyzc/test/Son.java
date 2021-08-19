package com.cyzc.test;

/**
 * <描述>
 *
 * @author Cyzc
 * @since 2021-08-15
 */
public class Son extends Father{
    public int i = 100;
    public void show() {
        System.out.println("子类 方法！！！");
    }
    public static void main(String[] args) {
        Father son = new Son();
        son.show();
        System.out.println(son.i);
    }
}

class Father {
    public int i = 50;
    public void show() {
        System.out.println("父类方法！");
    }}