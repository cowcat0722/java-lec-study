package ex17.multi03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Scanner;
// 수업 코드
public class Server {
    public static void main(String[] args)  {

        try {
            ServerSocket serverSocket = new ServerSocket(20000);
            Socket socket = serverSocket.accept();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), "UTF-8")
            );

            // 2. 메시지 받기 스레드
            new Thread(() -> {
                while (true) {
                    String requestMsg = null;
                    try {
                        requestMsg = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("클라이언트한테 받음: " + requestMsg);
                }
            }).start();

            Scanner sc = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            // 2. 메시지 전송 스레드
            new Thread(() -> {
                while (true) {
                    String responseMsg = sc.nextLine();
                    pw.println(responseMsg);
                }
            }).start();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}