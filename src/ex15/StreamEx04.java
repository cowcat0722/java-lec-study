package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamEx04 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write("안녕 "); // readLine으로 읽기때문에 \n까지 읽어라고 \n을 입력해줘야함
            bw.write("반가워\n");
            bw.flush(); // 반드시 flush
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
