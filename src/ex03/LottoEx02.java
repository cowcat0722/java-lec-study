package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx02 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();
        int num;
        boolean isSame;

        // 1. 6바퀴 돌면서 로또 번호를 추첨할 예정
        // 2. 첫번째 바퀴는 공을 꺼내서 추첨한 번호를 그대로 입력
        // 3. 두번째 바퀴부터는 공을 꺼내서 이전에 추첨한 모든 번호와 비교(isSame)
        // 4. isSame == true (3번 부터 다시 시작)
        // 5. isSame == false (공 집어넣기 - 3번부터 다시 시작)

        for (int i = 0; i < arr.length; i++) {
            // 공 꺼내서 바로 추가
            if(i == 0){
                num = r.nextInt(45)+1;
                arr[i] = num;
                continue;
            }

            while(true){
                // 공을 꺼내기
                isSame = false;
                num = r.nextInt(45)+1;
                /**
                 *  이전 번호들과 비교
                 *  i == 1 ( 0 비교 )
                 *  i == 2 ( 1, 0 비교)
                 *  i == 3 ( 2, 1, 0 비교)
                 *  i == 4 ( 3, 2, 1, 0 비교)
                 *  i == 5 ( 4, 3, 2, 1, 0 비교)
                 */
                for (int j = i-1; j >= 0 ; j--) {
                    if(arr[j] == num){
                        isSame = true;
                        break;
                    }
                }
                if(!isSame){
                    arr[i] = num;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}