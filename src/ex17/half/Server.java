package ex17.half;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            Socket socket = serverSocket.accept();
            System.out.println("연결됨");

            InputStreamReader ir = new InputStreamReader(socket.getInputStream(),"UTF-8");
            BufferedReader br = new BufferedReader(ir);

            String msg = br.readLine();
            System.out.println(msg);

            OutputStreamWriter ow = new OutputStreamWriter(socket.getOutputStream(),"UTF-8");
            BufferedWriter bw = new BufferedWriter(ow);

            bw.write("상대방이 "+"\""+msg+"\""+"메시지를 수신하였습니다.\n");
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
