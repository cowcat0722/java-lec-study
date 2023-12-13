package ex02;

import java.util.Scanner;

public class MiniProject01 {
    public static void main(String[] args) {
        double c;
        Scanner sc = new Scanner(System.in);

        System.out.print("화씨 온도를 입력하시오: ");
        double f = sc.nextDouble();
        c =(double) 5/9*(f-32) ;

        System.out.println("섭씨 온도는" + c);
    }
}