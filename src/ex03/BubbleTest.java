package ex03;

import java.util.Arrays;

/***
 * 1회전(4바퀴)
 *
 * (1) 5, 8 비교 (변화 없음)
 *
 * (2) 8, 2 비교 (5, 2, 8, 4, 3)
 *
 * (3) 8, 4 비교 (5, 2, 4, 8, 3)
 *
 * (4) 8, 3 비교 (5, 2, 4, 3, 8)
 */
public class BubbleTest {
    public static void main(String[] args) {
        int[] arr = {5,8,2,4,3};
        final int N = arr.length;

        int temp;
        for (int j = 0; j < N-1; j++) {
            for (int i = 0; i < N-j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
