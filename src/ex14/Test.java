package ex14;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    static public void main(String []args) {
        List<String> list = Arrays.asList("Kim","Park","Lee","Choi","Chee");

        List<String> sublist = list.stream() // 스트림 생성
                .filter(s->s.startsWith("C"))   // 스트림 처리
                .sorted()                       // 스트림 처리
                .collect(Collectors.toList());  // 결과 생성

        System.out.println(sublist); // 결과 출력
    }
}