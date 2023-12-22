package ex06.example;

class Animal{
    void speak(){
        System.out.println("멍멍");
    }
    void run(){
        System.out.println("달린다");
    }
}

class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("야옹");
    }
}



public class AnimalEx01 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.speak();
        c1.run();
    }

}
