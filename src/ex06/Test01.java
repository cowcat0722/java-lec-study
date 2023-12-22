package ex06;

class A {
    public void print() {
        System.out.println("A의 print 메소드");
    }
}

class B extends A {
    public void print() {
        super.print(); // A의 print 메소드 호출
        System.out.println("B의 print 메소드");
    }
}

public class Test01 {
    public static void main(String[] args) {
        A b = new B();
        b.print(); // A의 print 메소드와 B의 print 메소드가 출력됨
    }
}