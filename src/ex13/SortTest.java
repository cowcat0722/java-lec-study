package ex13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int number;
    String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return number-o.number;
    }
}

public class SortTest {
    public static void main(String[] args) {
        Student array[] = {
                new Student(2,"김철수"),
                new Student(3,"이철수"),
                new Student(1,"박철수")
        };
        List<Student> list = Arrays.asList(array);
        Collections.sort(list); // 오름차순 정렬
//        Collections.sort(list,Collections.reverseOrder()); // 내림차순 정렬
        System.out.println(list);
    }
}
