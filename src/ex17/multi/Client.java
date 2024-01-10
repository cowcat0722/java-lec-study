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
            Socket socket = new Socket("localhost",20000);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
            Scanner sc = new Scanner(System.in);

            // 2. 메시지 전송 쓰레드
            new Thread(() -> {
                while(true){
                    pw.println(sc.nextLine());
                }
            } ).start();


            // 3. 메시지 읽기 스레드

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
