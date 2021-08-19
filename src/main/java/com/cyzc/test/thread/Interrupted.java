package com.cyzc.test.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-06-02
 */
public class Interrupted {

    public static void main(String[] args) throws InterruptedException {

        Thread sleepThread = new Thread(new SleepRunner(), "SleepThread");
        sleepThread.setDaemon(true);

        Thread busyThread = new Thread(new BusyRunner(), "BusyThread");
        busyThread.setDaemon(true);
        sleepThread.start();
        busyThread.start();

        TimeUnit.SECONDS.sleep(5L);

        sleepThread.interrupt();
        busyThread.interrupt();

        System.out.println("SleepThread interrupt is  " + sleepThread.isInterrupted());
        System.out.println("BusyThread interrupt is  " + busyThread.isInterrupted());

        SleepUtils.second(2L);

    }

    static class SleepRunner implements Runnable {

        @Override
        public void run() {
            while (true) {
                SleepUtils.second(10);
            }

        }
    }

    static class BusyRunner implements Runnable {

        @Override
        public void run() {
            while (true) {
            }
        }
    }

}