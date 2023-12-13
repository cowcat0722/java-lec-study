package ch02;

public class TypeConversion {
    public static void main(String[] args) {
        int i;
        double f;

        f = 1 / 5; // 1/5는 피연산자가 정수이므로 정수 연산으로 계산되어서 값은 0이 된다.
        System.out.println(f);

        f = (double) 1 / 5; // double로 형변환을 하여 1이 형변환 되고, 5도 자동으로 형변환 되어 값은 0.2가 된다.
        System.out.println(f);

        i = (int) 1.7 +  (int) 1.8; // int로 형변환 되어 1.7은 1, 1.8은 1 이 되어 값은 2가 된다.
        System.out.println(i);
    }
}
