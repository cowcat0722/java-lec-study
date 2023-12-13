package ex02.Programming;

import java.util.Scanner;

public class MiletoKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 마일의 값을 받는다.
        System.out.print("마일을 입력하시오: ");
        double mile = sc.nextDouble();

        // 2. 연산하여 출력한다.
        double km = mile * 1.609;
        System.out.println(mile + "마일은 " + km + "킬로미터 입니다.");
    }
}
