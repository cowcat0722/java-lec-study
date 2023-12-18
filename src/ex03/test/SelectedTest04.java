package ex03.test;

import java.util.Arrays;

public class SelectedTest04 {
    public static void main(String[] args) {
        int[] arr = {5,8,2,4,3};
        final int N = arr.length;
        int temp;

        for (int rep = 0; rep < N-1 ; rep++) {
            int min = rep;
            for (int i = rep + 1; i < N; i++) {
                if (arr[min] > arr[i]) {
                    min = i;
                }
            }
            if (rep != min) {
                temp = arr[min];
                arr[min] = arr[rep];
                arr[rep] = temp;
            }
        }
        for(int v : arr){
            System.out.print(v+" ");
        }
    }
}
