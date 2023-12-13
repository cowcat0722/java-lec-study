package ex04;

class Person2 {
    int age = 10;
    char gender = '남';
}

public class MemEx02 {
    public static void main(String[] args) {
        System.out.println("1년 지남");
        System.out.println("1년 지남");
        System.out.println("1년 지남");

        new Person2(); // Person2 class안에 static을 넣지 않고 여기서부터 불러옴. 동적 할당


        System.out.println("메인 종료");
    }
}
