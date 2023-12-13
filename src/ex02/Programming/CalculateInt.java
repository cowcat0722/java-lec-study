package ex02.Programming;

import java.util.Scanner;

public class CalculateInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 두 정수를 입력 받는다.
        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();

        // 2. 입력 받은 정수를 계산한다.
        System.out.println("두 수의 합:"+ (x+y));
        System.out.println("두 수의 차:"+ (x-y));
        System.out.println("두 수의 곱:"+ (x*y));
        System.out.println("두 수의 평균:"+ (x+y)/2.0);
        int max = (x>y) ? x:y;
        System.out.println("큰 수: " + max);
        int min = (x<y) ? x:y;
        System.out.println("작은 수: " + min);
    }
}
