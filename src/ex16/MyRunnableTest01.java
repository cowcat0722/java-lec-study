package ex16;

class MyRunnalbe implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }
    }
}

public class MyRunnableTest01 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnalbe());
        t.start();
    }
}
