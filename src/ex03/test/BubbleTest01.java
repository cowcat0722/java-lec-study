package ex03.test;

public class BubbleTest01 {
    public static void main(String[] args) {
        int[] arr = {5,8,2,4,3};

        final int N = arr.length; // 길이는 변하지 않기 때문에 final을 넣어서 구분해줌.

        //첫번째 4바퀴 돌기
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N-i-1; j++) {
                System.out.println("몇바퀴 돌까?");
            }
            System.out.println();
        }

        // 두번째 4바퀴 도는데, 1회전때 4바퀴도는 내부 포문 만들기
    }
}
