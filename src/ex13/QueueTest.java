package ex13;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            q.add(i);
        }

        System.out.println("큐 : "+q);

        int e = q.remove();
        System.out.println("삭제된 요소 : "+e);
        System.out.println("큐 : "+q);
        int r = q.remove();
        System.out.println("삭제된 요소 : "+r);
        System.out.println("큐 : "+q);
    }
}
