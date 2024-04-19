package Threads.ProducerConsumer;

public class Consumer extends Thread{
    Factory f;
    Consumer(Factory f) {
        this.f = f;
    }
    public void run() {
        while (true) {
            try {
                this.f.consumeItem();
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
