package Threads;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    List<Integer> list = new ArrayList<>(10);

    boolean flag=false;

    synchronized public void produceItem(int n) throws InterruptedException {

        if(this.list.size()>=10) {
            wait();
        }
        this.list.add(n);
        System.out.println("Current list : "+this.list);
        flag=true;
        notify();
    }

    synchronized public int consumeItem() throws InterruptedException {

        if(list.isEmpty()) {
            wait();
        }
        int e = this.list.removeLast();
        System.out.println("Consumed item : "+e);
        flag=false;
        notify();
        return e;
    }
}
