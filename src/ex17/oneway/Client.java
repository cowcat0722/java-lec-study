package ex17.oneway;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",10000);

            Scanner sc = new Scanner(System.in);
            String msg = sc.nextLine();

            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream(),"UTF-8")
            );

            bw.write(msg+"\n");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
