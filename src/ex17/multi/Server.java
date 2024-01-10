package ex17.multi;

// 서버 코드
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            Socket socket = serverSocket.accept();

            System.out.println("클라이언트 연결됨");

            // 클라이언트로부터 받은 데이터를 출력하는 스레드
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

            // 클라이언트로 데이터를 보내는 스레드
            Thread sendThread = new Thread(() -> {
                try {
                    BufferedWriter bw = new BufferedWriter(
                            new OutputStreamWriter(socket.getOutputStream(), "UTF-8")
                    );

                    BufferedReader consoleReader = new BufferedReader(
                            new InputStreamReader(System.in)
                    );

                    while (true) {
                        String msg = consoleReader.readLine();
                        bw.write(msg + "\n");
                        bw.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            receiveThread.start();
            sendThread.start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
