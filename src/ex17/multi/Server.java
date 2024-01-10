package ex17.multi;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception{
//        try {
            // 1. 소켓과 버퍼 만들기
            ServerSocket serverSocket = new ServerSocket(30000);
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(),"UTF-8")
            );

            Scanner sc = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);

            // 2. 메시지 받기 쓰레드
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

            // 3. 메시지 전송 쓰레드
            new Thread(() -> {
                while(true){
                    pw.println(sc.nextLine());
                }
            } ).start();



//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}