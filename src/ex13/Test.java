package ex13;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int a;
        for(int i = 0 ; i<my_string.length();i++){
            try{
                a = Integer.parseInt(String.valueOf(my_string.charAt(i)));
                answer = answer+a;
            }catch(Exception e){
            }
        }
        return answer;
    }
}

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("123b"));

    }
}
