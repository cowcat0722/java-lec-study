package ex17.multi;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class Communication extends Thread{
    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            Socket socket = serverSocket.accept();

            System.out.println("클라이언트 연결됨");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(),
                            "UTF-8")
            );

            String msg = br.readLine();
            System.out.println(msg);

            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream(),
                            "UTF-8")
            );

            bw.write("상대방이 "+"\""+msg+"\""+" 메시지를 수신하였습니다"+"\n");
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



public class Server {
    public static void main(String[] args) {
        Communication communication = new Communication();
        communication.start();
    }
}