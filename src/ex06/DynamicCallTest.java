package ex06;

class Animals{
    void speak(){
        System.out.println("Animals 클래스");
    }
}

class Dog01 extends Animals{
    void speak(){
        System.out.println("멍멍");
    }
}
class Cat01 extends Animals{
    void speak(){
        System.out.println("야옹");
    }
}

public class DynamicCallTest {
    public static void main(String[] args) {
        Animals dog = new Dog01();
        Animals cat = new Cat01();

        dog.speak();
        cat.speak();

    }
}
