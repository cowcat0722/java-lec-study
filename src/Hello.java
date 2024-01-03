import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<numlist.length; i++){
            // String은 .length() 이고 배열은 .length
            if(numlist[i]%n==0){
                list.add(numlist[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

public class Hello {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numlist = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(s.solution(3, numlist)));
    }
}
