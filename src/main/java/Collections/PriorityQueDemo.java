package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

public class PriorityQueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(new CustomComparator());
        pq.add("Pathan");
        pq.add("Adil");
        pq.add("Khan");
        System.out.println(pq);
    }
}
