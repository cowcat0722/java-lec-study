package ex03;

import java.util.Scanner;

public class Averager {
    public static void main(String[] args) {
        int n;
        int i=0;
        int sum=0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("정수를 입력하시오:");
            n = sc.nextInt();
            if(n < 0){
                break;
            }
            i++;
            sum = sum + n;
        }
        System.out.println("평균은"+(double)sum/i);
    }
}
