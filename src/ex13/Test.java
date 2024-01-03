package ex13;

import java.util.*;


class Solution {
    public int[] solution(int[] array) {
        int[] answer = {array[0],0};
        for(int i=1;i<array.length;i++){
            if(answer[0]<array[i]){
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,8,3};
        System.out.println(Arrays.toString(s.solution(arr)));

    }
}
