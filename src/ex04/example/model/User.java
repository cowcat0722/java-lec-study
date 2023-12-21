package ex04.example.model;

public class User {
    final int id;
    String name;
    String email;

    public User(int id, String name, String email) { // 생성자
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
