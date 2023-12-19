package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx03 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();
        int num;

        for (int i = 0; i < arr.length; i++) {
                num = r.nextInt(45)+1;
                arr[i] = num;
                for (int j = i-1; j >= 0 ; j--) {
                    if(arr[j] == num){
                        i--;
                        break;
                    }
                }
        }
        System.out.println(Arrays.toString(arr));
    }
}