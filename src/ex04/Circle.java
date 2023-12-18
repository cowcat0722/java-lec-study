package ex04;

// 설계도
public class Circle {
    private int radius;

    // 생성자 (생성될때 무조건 실행되는 메서드)
    public Circle(int r){
        radius = r;
    }

    public double getArea() {
        return 3.14*radius*radius;
    }
}
