package ex03;

import java.util.Scanner;

public class GetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;

        while (true) { // if 문을 안쓰고 true 자리에 n != -1을 넣어도 되지만 break로 쓰도록하자
            System.out.print("정수를 입력하시오: ");
            int n = sc.nextInt();

            if (n==-1) {
                System.out.println("정수의 합은 "+sum+"입니다.");
                break;
            }
            sum = sum+n;
        }
    }
}
