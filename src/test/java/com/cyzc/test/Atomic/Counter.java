package com.cyzc.test.Atomic;

import java.util.concurrent.locks.ReentrantLock;

/**
 * <描述>
 *
 * @author Cyzc
 * @since 2021-08-24
 */
public class Counter {

    private int i=0;

    private ReentrantLock lock=new ReentrantLock();

    public void lockMethod1(){
        lock.lock();
        try {
            add();
        }finally {
            lock.unlock();
        }
    }

    public synchronized void lockMethod2(){
        add();
    }

    private void add() {
        i++;
    }
}