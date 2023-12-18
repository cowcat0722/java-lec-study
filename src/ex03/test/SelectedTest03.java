package ex03.test;

import java.util.Arrays;

// 1회전
public class SelectedTest03 {
    public static void main(String[] args) {
        int[] arr = {5,8,2,4,3};
        final int N = arr.length;
        int temp;
        final int rep = 0;
        int min = rep;

        for (int i = 0; i < N-1; i++) {
            if(arr[min] > arr[rep+i]){
                min = rep+i;
            }
        }
        if(arr[min] != arr[rep]){
            temp = arr[min];
            arr[min] = arr[rep];
            arr[rep] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
