package ex17.multi;

// 클라이언트 코드
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 10000);

            // 사용자 입력을 받아 서버로 전송하는 스레드
            Thread sendThread = new Thread(() -> {
                try {
                    BufferedWriter bw = new BufferedWriter(
                            new OutputStreamWriter(socket.getOutputStream(), "UTF-8")
                    );

                    Scanner sc = new Scanner(System.in);
                    while (true) {
                        String msg = sc.nextLine();
                        bw.write(msg + "\n");
                        bw.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // 서버로부터 받은 데이터를 출력하는 스레드
            Thread receiveThread = new Thread(() -> {
                try {
                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(socket.getInputStream(), "UTF-8")
                    );

                    String msg;
                    while ((msg = br.readLine()) != null) {
                        System.out.println(msg);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            sendThread.start();
            receiveThread.start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
