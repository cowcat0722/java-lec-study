package ex14;

import java.util.Arrays;
import java.util.List;

class User{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void changeAge(int a){
        this.age = this.age-a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class StreamEx01 {
    public static void main(String[] args) {
        User u1 = new User("홍길동",20);
        User u2 = new User("장보고",15);
        User u3 = new User("임꺽정",30);

        List<User> list = Arrays.asList(u1,u2,u3);

        list.stream().map(u -> {
            u.changeAge(3);
            return u;
        }).toList();

        list.stream().forEach(u -> {
            System.out.println(u.getAge());
        } );
    }
}
