package ex03.test;

public class Programmers {
    public static void main(String[] args) {
        int[] numbers = {5,2,8,3,4,10};
        int N = numbers.length;

        int a = -1;
        for (int i = 0; i < N; i++) {
            a = (a>numbers[i]) ? a : numbers[i];
        }
        int j;
        for (j = 0; j < N; j++) {
            if(a==numbers[j])
            break;
        }
        numbers[j] = -1;
        int b=-1;
        for (int i = 0; i < N; i++) {
            b = (b>numbers[i]) ? b : numbers[i];
        }




    }
}
