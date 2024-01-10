package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server{
    public static void main(String[] args) {

        try {
            // 클라이언트 연결
            ServerSocket serverSocket = new ServerSocket(20000);
            Socket socket = serverSocket.accept();

            // receive
            new Thread(() -> {
                try {
                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(socket.getInputStream(),"UTF-8")
                    );
                    while(true) {
                        String receiveMsg = br.readLine();
                        System.out.println("클라이언트로 부터 받은 메시지 : " + receiveMsg);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }).start();

            // send
            new Thread(() -> {
                try {
                    PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
                    Scanner sc = new Scanner(System.in);

                    while(true) {
                        String requestMsg = sc.nextLine();
                        pw.println(requestMsg);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }).start();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}