package ex13;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Pear");
        list.add("Grape");

        int index = list.indexOf("Mango"); // index의 위치를 알려줌
        boolean search = list.contains("Mango"); // "Mango"가 있는지 없는지 알려줌

        System.out.println("Mango의 위치 : "+index);
        System.out.println(search);
    }
}
