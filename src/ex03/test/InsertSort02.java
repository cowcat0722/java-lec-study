package ex03.test;

import java.util.Arrays;

public class InsertSort02 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        int temp;
        int N = arr.length
        // 1회전
        if(arr[1]<arr[0]){
            //스왑
            temp = arr[1];
            arr[1] = arr[0];
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));

        // 2회전
        if(arr[2]<arr[1]){
            if(arr[2]<arr[0]){
                // 스왑
                temp = arr[2];
                arr[2] = arr[1];
                arr[1] = arr[0];
                arr[0] = temp;
            }else{ // arr[2]>arr[0]
                temp = arr[2];
                arr[2] = arr[1];
                arr[1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

        // 3회전
        if(arr[3]<arr[2]){
            if(arr[3]<arr[1]){
                if(arr[3]<arr[0]){
                    temp = arr[3];
                    arr[3] = arr[2];
                    arr[2] = arr[1];
                    arr[1] = arr[0];
                    arr[0] = temp;
                }else{
                    temp = arr[3];
                    arr[3] = arr[2];
                    arr[2] = arr[1];
                    arr[1] = temp;
                }
            }else{
                temp = arr[3];
                arr[3] = arr[2];
                arr[2] = temp;
            }
        }

        for (int i = 1; i < arr.length ; i++) {
            int key = arr[i]

        }

        System.out.println(Arrays.toString(arr));

        // 4회전
        if(arr[4]<arr[3]){
            if(arr[4]<arr[2]){
                if(arr[4]<arr[1]){
                    if(arr[4]<arr[0]){
                        temp = arr[4];
                        arr[4] = arr[3];
                        arr[3] = arr[2];
                        arr[2] = arr[1];
                        arr[1] = arr[0];
                        arr[0] = temp;
                    }else{
                        temp = arr[4];
                        arr[4] = arr[3];
                        arr[3] = arr[2];
                        arr[2] = arr[1];
                        arr[1] = temp;
                    }
                }else{
                    temp = arr[4];
                    arr[4] = arr[3];
                    arr[3] = arr[2];
                    arr[2] = temp;
                }
            }else{
                temp = arr[4];
                arr[4] = arr[3];
                arr[3] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
