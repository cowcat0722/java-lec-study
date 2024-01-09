package ex17.oneway;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        // localhost = 127.0.0.1 (루프백)
        try {
            Socket socket = new Socket("127.0.0.1",10000); // (ip,port)  // 127.0.0.1 루프백 ip

            Scanner sc = new Scanner(System.in);
            String msg = sc.nextLine();

            BufferedWriter bw = new BufferedWriter( // 보조 스트림을 버퍼로 생성
                    new OutputStreamWriter(socket.getOutputStream(), // 보조스트림 만들기 ( 아웃풋 스트림 연결 )
                            "UTF-8") // UTF-8(한글 3Byte, 영어 1Byte)로 안하면 1Byte씩 읽어들이기 때문에 한글이 다 깨진다.
            );

            bw.write(msg+'\n');
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
