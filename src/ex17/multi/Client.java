package ex17.multi;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

class Communication2 extends Thread{
    @Override
    public void run() {
        try {
            Socket socket = new Socket("127.0.0.1",10000);

            Scanner sc = new Scanner(System.in);
            String msg = sc.nextLine();

            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream(),
                            "UTF-8")
            );

            bw.write(msg+"\n");
            bw.flush();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(),
                            "UTF-8")
            );

            String ackmsg = br.readLine();
            System.out.println(ackmsg);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Client {
    public static void main(String[] args) {
        Communication2 communication2 = new Communication2();
        communication2.start();
    }
}
