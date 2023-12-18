package ex03.test;

public class BinaryTest02 {
    public static void main(String[] args) {
        // 이진 검색 => 반드시 정렬이 되어 있어야 한다.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10}; // 9 / 2 = 4
        int target = 10;
        int count=0;
        // target = 8

        // start=0 ~ end = 8
        //        // mid = N/2 = 4 -> arr[4] -> 값 5
        int mid = arr.length/2;
        int start = 0;
        int end = arr.length-1;
        //        // if(8==5) -> mid 위치에 타겟이 있다.
        //        // if(8>5) 참
        
        //        // start=5 (mid+1) ~ end=8
        //        // mid = 7 = arr[7] -> 값 8
        //        // if(8==8) -> mid 위치에 타겟이 있다.
        //        // if(8>8)
        
        //        // target = 3
        //
        //        // start=0 ~ end = 8
        //        // mid = N/2 = 4 -> arr[4] -> 값 5
        //        // if(3==5) -> mid 위치에 타겟이 있다.
        //        // if(3>5) 거짓
        
        //        // start=0 ~ end = mid-1
        //        // mid = 7 = arr[7] -> 값 8
        //        // if(8==8) -> mid 위치에 타겟이 있다.
        //        // if(8>8)
        for (;;) {
            count++;
            if (arr[mid] == target) {
                System.out.println("시도 횟수: "+count+"번");
                System.out.println("배열의 "+(mid+1)+"번째에 있습니다.");
                break;
            } else if (arr[mid] > target) {// 왼쪽
                end = mid-1;
                mid = (start+end+1)/2;
            } else { // target 오른쪽
                start = mid+1;
                mid = (start+end+1)/2;
            }
        }
    }
}