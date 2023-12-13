package ex02;

import java.util.Scanner;

public class MiniProject03 {
    public static void main(String[] args) {
        System.out.println("==============");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("==============");

        System.out.print("번호를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 1) {

            System.out.print("화씨 온도를 입력하시오: ");
            Scanner sc1 = new Scanner(System.in);
            double f1 = sc1.nextDouble();
            double c1 = (double) 5 / 9 * (f1 - 32);

            System.out.println("섭씨 온도는" + c1);
        }else if(a == 2){
            System.out.print("섭씨 온도를 입력하세요: ");
            Scanner sc2 = new Scanner(System.in);
            double c2 = sc2.nextDouble();
            double f2 = (double) 9 / 5 * c2 + 32;

            System.out.println("화씨 온도는 " + f2);
        }else{
            System.out.println("번호를 잘못 입력하셨습니다.");
        }
    }
}
