package ex03;

import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer;
        int guess = (int) (Math.random() * 100);
        int count = 0;

        while(true){
            count ++;
            System.out.print("정답을 추측하여 보시오: ");
            answer = sc.nextInt();
            if(guess>answer) {
                System.out.println("더 높은 숫자 입니다.");
            }else if(guess<answer){
                System.out.println("더 낮은 숫자 입니다.");
            }else{
                System.out.print("축하합니다. ");
                break;
            }
        }
        System.out.println("시도횟수="+count);
    }
}
