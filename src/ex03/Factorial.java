package ex03;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long fact = 1;
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하시요: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }

        System.out.println(n + "!은 " + fact +"입니다.");
    }
}
