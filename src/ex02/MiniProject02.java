package ex02;

import java.util.Scanner;

public class MiniProject02 {
    public static void main(String[] args) {

        System.out.print("섭씨 온도를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = (double) 9/5 * c + 32;

        System.out.println("화씨 온도는 " + f);
    }
}
