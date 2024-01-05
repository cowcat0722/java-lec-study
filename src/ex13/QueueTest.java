package ex13;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            q.add(i);
        }

        System.out.println("큐 : "+q); // 1부터 5까지 순차적으로 데이터가 들어감

        int e = q.remove(); // FIFO로 인해 맨처음 들어간 데이터가 삭제됨
        System.out.println("삭제된 요소 : "+e);
        System.out.println("큐 : "+q);
        int r = q.remove(); // FIFO로 인해 그 다음 들어간 데이터가 삭제됨
        System.out.println("삭제된 요소 : "+r);
        System.out.println("큐 : "+q);
    }
}
