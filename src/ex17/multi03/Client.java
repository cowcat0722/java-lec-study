package ex17.multi03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Scanner;
// 수업코드
public class Client {
    public static void main(String[] args) {

        // 1. 소켓과 버퍼 만들기
        // "192.168.0.124"
        try {

            Socket socket = new Socket("192.168.0.35", 20000);
            Scanner sc = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            // 2. 메시지 전송 스레드
            new Thread(() -> {
                while (true) {
                    String responseMsg = sc.nextLine();
                    pw.println(responseMsg);
                }
            }).start();

            // 3. 메시지 읽기 스레드

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), "UTF-8")
            );

            new Thread(() -> {
                while (true) {
                    String requestMsg = null;
                    try {
                        requestMsg = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("서버한테 받음: " + requestMsg);
                }
            }).start();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}