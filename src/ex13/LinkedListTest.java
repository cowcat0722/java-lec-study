package ex13;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER"); // MILK BREAD BUTTER
        list.add(1,"APPLE"); // MILK APPLE BREAD BUTTER 삽입된다.
        list.set(2,"GRAPE"); // MILK APPLE GRAPE BUTTER

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
