package ex03.Programming;

import java.util.Scanner;

public class Pro02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("연산을 입력하세요: ");
        String cal = sc.nextLine();
        System.out.print("피연산자 2개를 입력하세요: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double result;

        switch (cal){
            case "+" :
                System.out.println(n1+" + "+n2+" = "+(n1+n2));
                break;
            case "-" :
                System.out.println(n1+" - "+n2+" = "+(n1-n2));
                break;
            case "*" :
                System.out.println(n1+" * "+n2+" = "+(n1*n2));
                break;
            case "/" :
                System.out.println(n1+" / "+n2+" = "+(n1/n2));
                break;
        }

    }
}
