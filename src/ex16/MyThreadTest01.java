package ex16;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }
}

public class MyThreadTest01 {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        });
        t2.start();
    }
}

