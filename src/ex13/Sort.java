package ex13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        String[] sample = {"i","walk","the","line"};

//        Arrays.sort(sample);
//        System.out.println(Arrays.toString(sample)); // 아래 코드와 같은 결과를 가집니다. 다만 sample은 여기서는 배열,
        List<String> list = Arrays.asList(sample); // 여기서는 list로 변환됩니다.
        Collections.sort(list);
        System.out.println(list);
    }
}
