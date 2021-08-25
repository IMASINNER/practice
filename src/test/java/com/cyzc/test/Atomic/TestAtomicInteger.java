package com.cyzc.test.Atomic;

import java.util.concurrent.atomic.AtomicInteger;
import org.junit.Test;

/**
 * <描述>
 *
 * @author Cyzc
 * @since 2021-08-23
 */
public class TestAtomicInteger {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Test
    public void testAtomicInteger() {
        //atomicInteger.incrementAndGet();
        System.out.println(atomicInteger.incrementAndGet());
    }


}