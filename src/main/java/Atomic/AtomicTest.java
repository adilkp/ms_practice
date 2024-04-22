package Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(100);
        System.out.println(atomicInteger);
        System.out.println(atomicInteger.addAndGet(1));
        System.out.println(atomicInteger);
        System.out.println(atomicInteger.getAndAdd(1));
        System.out.println(atomicInteger);
    }
}
