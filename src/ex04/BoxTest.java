package ex04;
class Box{
    int width;
    int length;
    int heigth;
    double getVolume(){
        return (double) width*heigth*length;
    }

}

public class BoxTest {
    public static void main(String[] args) {
        Box b = new Box();
        b.width = 20;
        b.length = 20;
        b.heigth = 30;
        System.out.println("상자의 가로, 세로, 높이는 "+b.width+", "+b.length+", "+b.heigth+"입니다.");
        System.out.println("상자의 부피는 "+b.width*b.length*b.heigth+"입니다.");
    }
}
