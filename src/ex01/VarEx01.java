package ex01;

public class VarEx01 {

    // 모든 코드는 main 메서드 내부에 적는다.
    public static void main(String[] args) {
        int n1 = 1; // 21억 까지 (4Byte)
        double d1 = 1.5; // 21억 까지 (8Byte)
        long big1 = 20000000000L; // 경까지 (8Byte) 대문자 L을 입력해주어야 함 (정수표현 범위를 넘어서면)
        boolean b1 = true; // true, false 저장 가능 true = 1, false = 0 으로 메모리에 저장됨
        char c1 = '가'; // 문자 하나 저장

        System.out.println(n1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
        System.out.println(c1);
    } // 자바 프로그램 종료
}