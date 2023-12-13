package ex02.test;

import java.util.Scanner;

public class FtoC3Test {
    public static void main(String[] args) {
        System.out.println("================");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("================");
        System.out.println();
        System.out.print("번호를 입력하시오: ");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x == 1 ? "화씨 온도를 입력하시오: " : "섭씨 온도를 입력하시오:");


    }
}
