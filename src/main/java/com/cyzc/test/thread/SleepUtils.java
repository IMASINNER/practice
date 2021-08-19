package com.cyzc.test.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author: Cyzc
 * @description:
 * @create: 2021-06-02
 */
public class SleepUtils {
    public static final void second(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}