package Threads.EvenOdd;

class EvenOddSynch {

    int n = 10;
    int counter=0;
    boolean flag=false;
    synchronized void printEven() throws InterruptedException {
        while(counter <= n) {
            if(flag==true) {
                wait();
            }
            System.out.println("From Even thread : "+counter);
            Thread.sleep(1000);
            counter++;
            flag=true;
            notify();
        }
    }

    synchronized void printOdd() throws InterruptedException {
        while (counter <= n) {
            if(flag==false) {
                wait();
            }
            System.out.println("From Odd thread : "+counter);
            Thread.sleep(1000);
            counter++;
            flag=false;
            notify();
        }
    }
}
public class EvenOddMain {

    public static void main(String[] args) {
        EvenOddSynch evenOddSynch = new EvenOddSynch();
        Runnable even = (() -> {
            try {
                evenOddSynch.printEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Runnable odd = new Runnable() {
            @Override
            public void run() {
                try {
                    evenOddSynch.printOdd();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(even);
        Thread t2 = new Thread(odd);
        t1.start();
        t2.start();

    }
}
