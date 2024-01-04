package ex13;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {

        Vector<String> vec = new Vector();
        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");

        // 크기
        System.out.println("크기 : " + vec.size());

        // 인덱스 접근
        System.out.println("인덱스 1 : " + vec.get(1));

        // 정렬
        Collections.sort(vec); // 오름차순

        for(String s : vec){
            System.out.print(s+" ");
        }
        System.out.println();

        Collections.sort(vec,Collections.reverseOrder()); // 내림차순

        for(String s : vec){
            System.out.print(s+" ");
        }
        System.out.println();

        // 정렬 (다른 방법)
        //Arrays.sort();

        //삭제
        String result = vec.remove(2 );
        System.out.println(result); // 삭제된 것 보여줌
        System.out.println(vec.size());

        // 값 찾기
        boolean search = vec.contains("Mango");
        System.out.println(search);
    }
}
