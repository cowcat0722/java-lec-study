package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            // 1. 소켓과 버퍼 만들기
            Socket socket = new Socket("127.0.0.1",20000);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
            Scanner sc = new Scanner(System.in);

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(),"UTF-8")
            );

            // 2. 메시지 전송 쓰레드
            new Thread(() -> {
                while(true){
                    pw.println(sc.nextLine());
                }
            } ).start();


            // 3. 메시지 읽기 스레드
            new Thread(() -> {
                while(true) {
                    try {
                        String requestMsg = br.readLine();
                        System.out.println("클라이언트로부터 받은 메시지 : " + requestMsg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
