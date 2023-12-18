package ex03;

import java.util.Arrays;

public class BubbleEx01 { //static을 찾을때는 class명으로 찾는다. BubbleEx01.bubble

    static void bubble(int[] arr){
        final int N = arr.length;

        int temp;
        for (int j = 0; j < N-1; j++) {
            for (int i = 0; i < N-j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i +1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr = {5,8,2,4,3};
        int[] arr2 = {5,8,2,4,3,100,25,30,16,89};
        BubbleEx01.bubble(arr);
        bubble(arr2); // 같은 class에서는 class명 생략 가능.
    }
}