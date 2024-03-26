package Threads;

public class F1 extends Thread{
    public void run() {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.f2();
    }
}
