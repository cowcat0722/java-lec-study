package ex03.test;

import java.util.Scanner;

public class Sigma {
    public static void main(String[] args) {
        int m,a;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        m = sc.nextInt();

        for (int j = 1; j <= m; j++) {
            sum = sum+a*a+1;
        }

        System.out.println(sum);
    }
}
