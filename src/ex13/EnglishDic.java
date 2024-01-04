package ex13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishDic {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("map","지도");
        map.put("school","학교");
        map.put("java","자바");
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.print("영어 단어를 입력하시오:");
        String key = sc.next();
        if(key.equals("quit")){
            System.out.println("시스템 종료");
            break;
        }
        System.out.println("단어의 의미는 "+map.get(key));
        }

    }

}
