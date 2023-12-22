package ex06.example3;

public class River {
    String name;

    public River(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println("리버가 공격합니다 : "+name);
    }
}
