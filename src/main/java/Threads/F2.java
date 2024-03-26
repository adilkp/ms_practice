package Threads;

public class F2 extends Thread{
    public void run() {
//        ThreadDemo.f1();
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.f1();
    }
}
