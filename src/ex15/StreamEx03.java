package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx03 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in); // 통신을 할 때에는 System.in 말고 소켓
        BufferedReader br = new BufferedReader(ir);

        try {
            String line = br.readLine(); // 한번에 읽을 때 \n까지 읽는다.
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
