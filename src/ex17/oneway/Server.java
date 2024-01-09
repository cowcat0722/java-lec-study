package ex17.oneway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000); // ServerSocket 생성
            Socket socket = serverSocket.accept(); // 리스너(연결 요청을 받을 때까지 기다림)
            System.out.println("Client 연결됨");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(),
                            "UTF-8")
            );
            while (true) {
                String msg = br.readLine();

                if (msg == null) break;

                System.out.println(msg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
