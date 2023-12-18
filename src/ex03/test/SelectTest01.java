package ex03.test;

// 1회전 {2,8,5,4,3} 2와 5자리 바뀜 코드 작성해보기
public class SelectTest01 {
    public static void main(String[] args) {
        int[] arr = {5,8,2,4,3};
        final int N = arr.length;
        int temp;
        final int rep = 0;
        int min = rep;

        if(arr[min] > arr[rep+1]){ // 변경 x
            min = rep+1;
        }
        if(arr[min] > arr[rep+2]){ // 변경
            min = rep+2;
        }
        if(arr[min] > arr[rep+3]){ // 변경 x
            min = rep+3;
        }
        if(arr[min] > arr[rep+4]){ //
            min = rep+4;
        }
        if(arr[min] != arr[rep]){
            temp = arr[min];
            arr[min] = arr[rep];
            arr[rep] = arr[min];
        }
    }
}
