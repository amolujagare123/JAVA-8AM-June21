package CollectionDemo;

import java.util.PriorityQueue;

public class PriorityQueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(23);
        pq.offer(13);
        pq.offer(43);
        pq.offer(26);
        pq.offer(20);
        pq.offer(3);

        // 3 ,13 ,20, 23, 26 ,43

        // some operating systems does not support the priority queue
        // actually internally the elements are arranged in sorted order
        // only

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        System.out.println(pq);


    }
}
