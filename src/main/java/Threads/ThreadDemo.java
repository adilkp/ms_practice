package Threads;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Runnable and Callable Demo...");
        Thread1 thread1 = new Thread1();
        thread1.start();
    }
}
