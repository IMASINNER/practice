package com.cyzc.test.ThreadDemo;

public class VolatileDemo {


    volatile long v1=100L;

    public void set(long l){
        v1=1;
    }


    public void getAndAdd(){
        v1++;
    }

    public long get(){
        return v1;
    }




}
