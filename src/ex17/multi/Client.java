package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

 //       try {
            Socket socket = new Socket("192.168.0.93",30000); // 서버 연결

            // send
            Thread send = new Thread(() -> {
                try {
                    Scanner sc = new Scanner(System.in);
                    PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);

                    while(true) {
                        String sendMsg = sc.nextLine();
                        pw.println(sendMsg);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            // receive
            Thread receive = new Thread(() -> {
                try {
                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(socket.getInputStream(),"UTF-8")
                    );

                    while(true) {
                        String receiveMsg = br.readLine();
                        System.out.println("서버로 부터 받은 메시지 : " + receiveMsg);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } );

            send.start();
            receive.start();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


    }
}