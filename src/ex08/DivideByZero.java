package ex08;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
         int num = 0;


        int result = 0;
        try {
            result = 10/num;
        } catch (Exception e) {
            System.out.println("0으로 나누면 안된다");
//            System.out.println(e.getMessage());
//            System.out.println(e.getClass());
//            e.printStackTrace(); // try catch 안했을 때 뜨는 피범벅
              throw new RuntimeException("0으로 나눌 수 없어요");
        }
        System.out.println("나눗셈 결과 : " +result);
    }


}
