package ex06.example2;

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

    void sleep(){
        System.out.println("잠잔다");
    }
}



public class AnimalEx01 {
    public static void main(String[] args) {
        Animal c1 = new Cat(); // [Cat, Animal] 다형성
        c1.speak(); // Animal의 speak를 호출할 때 Cat이 재정의를 했기 때문에 Cat의 speak 실행
        c1.run();
    }

}
