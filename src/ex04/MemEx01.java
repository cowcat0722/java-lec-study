package ex04;

class Person1{
    static int age = 20; // JVM을 실행하면 첫 번째로 static을 찾는다. 정적 메모리 할당
    static char gender = '여';
}

public class MemEx01 {
    public static void main(String[] args) {
        System.out.println(Person1.age);
        System.out.println(Person1.gender);
    }
}
