package ex06;

class Shape{
    int x,y;

    public Shape() {
        System.out.println("Shape 생성됨");
    }
}

class Circle extends Shape {
    int radius; // 반지름

    public Circle(int radius) {
        System.out.println("Circle 생성됨");
        this.radius = radius;
        System.out.println("1");
        super.x = 0; // this 는 자기 자신, super 는 부모의 x
        super.y = 0;
    }

    double getArea(){
        return 3.14*radius*radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(10); // 자식을 메모리에 띄울때 부모를 먼저 띄우고 자식을 띄움
        c.getArea();
        System.out.println("원의 중심: ("+c.x+", "+c.y+")");
        System.out.println("원의 면적: "+c.getArea());
    }

}
