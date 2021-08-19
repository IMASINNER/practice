package com.cyzc.test.thread;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-06-02
 */
public class Daemon {

    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonRunner(),"DaemonRunner");
        thread.setDaemon(true);
        thread.start();
    }


    static class DaemonRunner implements Runnable {

        @Override
        public void run() {
            try {
                SleepUtils.second(10);
            }finally {
                System.out.println("DaemonThread finn");
            }
        }
    }

}