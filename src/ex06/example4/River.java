package ex06.example4;

public class River extends Protoss{
    String name;

    public River(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println("리버가 공격합니다 : "+name);
    }
}
