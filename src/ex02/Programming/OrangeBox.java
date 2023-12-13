package ex02.Programming;

import java.util.Scanner;

public class OrangeBox {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("오렌지의 개수를 입력하시오: ");
        int orange = sc.nextInt();
        int resultOrange = orange%10;
        int resultBox = orange/10;
        System.out.println(resultBox+"박스가 필요하고 "+resultOrange+ "개가 남습니다.");
    }
}
