package ex16;

public class ThreadEx01 {

    public static synchronized void sub1() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("start1 thread : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static synchronized void sub2() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("start2 thread : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // main thread
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            sub1();
        });
        t1.start();

        // 실을 만드는 것
        Thread t2 = new Thread(() -> {
            sub2();
        });
        t2.start(); // 실을 시작하는것
    } // main 스레드 종료
}