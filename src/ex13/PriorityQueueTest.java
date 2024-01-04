package ex13;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(80);
        pq.add(20);

        System.out.println(pq);
        System.out.println("삭제된 원소 : "+pq.remove()); // 작은 숫자가 우선순위가 높음
        System.out.println(pq);
    }
}
