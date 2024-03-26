package Threads;

public class ThreadDemo {

    public synchronized void f1() {
        System.out.println("f1...");
    }

    public synchronized void f2() {
        System.out.println("f2...");
    }

    public static void main(String[] args) {
           F1 f1 = new F1();
           F2 f2 = new F2();

           f1.start();
           f2.start();

//        System.out.println("Runnable and Callable Demo...");
//        Thread1 thread1 = new Thread1();
//        thread1.start();
    }
}
