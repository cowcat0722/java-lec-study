package ex06.shape;

class Shape{
    public double getArea(){
        return 0;
    }
    public Shape(){}
}

class Rectangle extends Shape{
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
}

class Triangle extends Shape{
    private double base, height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getArea(){
        return base*height*0.5;
    }
}

public class ShapeAreaTest {
    public static void main(String[] args) {
        Shape rec1 = new Rectangle(10.0,20.0);
        Shape tri1 = new Triangle(10.0,20.0);

        System.out.println("사각형 : "+ rec1.getArea());
        System.out.println("삼각형 : "+ tri1.getArea());
    }
}
