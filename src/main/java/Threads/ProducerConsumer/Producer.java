package Threads.ProducerConsumer;

public class Producer extends Thread{

    Factory f;
    Producer(Factory f) {
        this.f = f;
    }

    public void run() {
        int i=1;
        while (true) {
            try {
                this.f.produceItem(i);
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }

}
