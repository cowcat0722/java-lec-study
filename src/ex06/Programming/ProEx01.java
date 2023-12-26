package ex06.Programming;

class Circle{
    protected int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

}

class Pizza extends Circle{
    String name;

    public Pizza(String name, int radius) {
        super(radius);
        this.name = name;
    }

    public void print(){
        System.out.println("피자의 종류 : "+this.name +", 피자의 크기 : "+ this.radius);
    }
}

public class ProEx01 {
    public static void main(String[] args) {
        Pizza obj = new Pizza("Pepperoni",20);
        obj.print();
    }
}
