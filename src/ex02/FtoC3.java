package ex02;

import java.util.Scanner;

public class FtoC3 {
    public static void main(String[] args) {
        System.out.println("================");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("================");
        System.out.println();
        System.out.print("번호를 입력하시오: ");

        // 1. 화씨 혹은 섭씨를 선택하는 로직
        Scanner sc = new Scanner(System.in);
        int selectedNum = sc.nextInt();
        System.out.print((selectedNum == 1) ? "화씨 온도를 입력하시오: " : "섭씨 온도를 입력하시오:");

        // 2. 화씨 혹은 섭씨 온도 받기
        double temp = sc.nextDouble();
        double result = (selectedNum == 1) ?  5.0/9.0*(temp-32) : 9.0/5.0*temp+32;

        // 3. 받은 화씨 혹은 섭씨 온도를 변환하기
        System.out.print((selectedNum == 1) ? "화씨 온도는 " + result : "섭씨 온도는 " + result);
    }
}