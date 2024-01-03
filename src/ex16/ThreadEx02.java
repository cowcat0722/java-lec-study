package ex16;

class MyFile {

    // 하드디스크 기록 (I/O)
    public void write() {
        try {
            Thread.sleep(5000);
            System.out.println("파일 쓰기 완료");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class 화가 {
    public void 그림그리기() {
        System.out.println("그림 그리기 완료");
    }
}

public class ThreadEx02 {

    public static void main(String[] args) {
        new Thread(() -> {
            MyFile mf = new MyFile();
            mf.write();
        }).start();

        화가 h = new 화가();
        h.그림그리기();
    }
}