package ex03;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] arr = new int[3]; // 연속된 12byte 공간을 확보함.

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }
}
