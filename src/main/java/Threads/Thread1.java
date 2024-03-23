package Threads;

import java.io.IOException;

public class Thread1 extends Thread{
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
