package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

//class CustomComparator implements Comparator<String> {
//
//    @Override
//    public int compare(String o1, String o2) {
//        return o1.compareTo(o2);
//    }
//}

public class PriorityQueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(11);
        pq.add(13);
        pq.add(10);
        pq.add(9);
        System.out.println(pq);

        PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<>();
        pbq.add(15);
        pbq.add(11);
        pbq.add(13);
        pbq.add(10);
        pbq.add(9);
        System.out.println(pbq);

    }
}
