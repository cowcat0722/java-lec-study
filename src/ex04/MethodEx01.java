package ex04;

public class MethodEx01 {

    static void m1(){
        System.out.println("m1");
    }

    static String m2(){
        System.out.println("m2");
        return "m2";
    }

    public static void main(String[] args) {
        m1(); // MethodEx01.m1() 으로 해야하지만 같은 클래스 안에있으면 생략가능
        m2();
        String result = m2();
    }
}
