package ex03.Programming;

public class Pro06 {
    public static void main(String[] args) {
        for (int x = 0; x <= 10 ; x++) {
            for (int y = 0; y <= 10 ; y++) {
                if((x * 3 + 10 *y) == 100){
                    System.out.println("("+x+","+y+")");
                }
            }
        }
    }
}
