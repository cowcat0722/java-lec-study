package ex15;

import java.io.*;

public class StreamEx06 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\ex15\\hello.txt"));

            String line = br.readLine();
            System.out.println(line);

            BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ex15\\input.txt"));
            bw.write("안녕");
            bw.write("반가워\n");
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
