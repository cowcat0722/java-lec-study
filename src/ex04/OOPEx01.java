package ex04;

class Person3 {
    int weight = 100;
}

public class OOPEx01 {
    public static void main(String[] args) {
        Person3 p3 = new Person3();
        System.out.println("p3의 몸무게 : "+p3.weight);

        p3.weight = 60;
        System.out.println("p3의 몸무게 : "+p3.weight);
    }
}
