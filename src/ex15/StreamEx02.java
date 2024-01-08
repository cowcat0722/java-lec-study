package ex15;

import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        char[] ch = new char[4]; // 보조스트림 크기 4

        try {
            ir.read(ch); // 보조스트림 설정

            for(char c : ch){
                System.out.print(c+" ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
