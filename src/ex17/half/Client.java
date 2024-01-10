package ex17.half;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",10000);

            Scanner sc = new Scanner(System.in);
            String msg = sc.nextLine();

            OutputStreamWriter ow = new OutputStreamWriter(socket.getOutputStream(),"UTF-8");
            BufferedWriter bw = new BufferedWriter(ow);

            bw.write(msg+"\n");
            bw.flush();

            InputStreamReader ir = new InputStreamReader(socket.getInputStream(),"UTF-8");
            BufferedReader br = new BufferedReader(ir);

            String ackMsg = br.readLine();
            System.out.println(ackMsg);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
