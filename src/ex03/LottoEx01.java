package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();

        int num;

        for (int i = 0; i < arr.length; i++) { // 1~6번째 숫자 넣기
            if(i==0){ // 첫 번째 숫자 넣기
                num = r.nextInt(45)+1;
                arr[i] = num;
            }else{ // 2~6번째 숫자 넣기
                while(true) { // 무한 반복
                    num = r.nextInt(45) + 1;
                    for (int j = 0; j < i; j++) { // 1일떄 0, 2일때 0,1 .... 검사하는 코드
                        if (arr[j] != num) { // 중복이 아니라면 continue
                            if(j == i-1){ // for문 검사를 다했을시 값을 넣고 for문 빠져나오기
                                arr[i] = num;
                                break;
                            }
                        }else{ // 중복 이면 검사를 중단하고 다시 랜덤 숫자 받으러 for문 나옴
                            break;
                        }
                    }
                    if(arr[i] == num){ // 값을 넣었다면
                        break; // 무한 반복 해제
                    }
                }
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
