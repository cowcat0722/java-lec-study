package ex02;

public class CompOperator {
    public static void main(String[] args) {
        System.out.print((3 == 4) + " ");
        System.out.print((3 != 4) + " ");
        System.out.print((3 > 4) + " ");
        System.out.print((4 > 3) + " ");

        System.out.print((3 == 3 && 4 == 7) + " "); // && 둘다 참이면 참
        System.out.print((3 == 3 || 4 == 7) + " "); // || 둘중 하나만 참이면 참
    }
}
