package ex06.Programming.example6;

abstract class Protoss{
    public abstract void attack();
}

class Zealot extends Protoss{
    public void attack(){
        System.out.println("질럿이 공격합니다.");
    }
}

class Dragoon extends Protoss {
    public void attack() {
        System.out.println("드라군이 공격합니다.");
    }
}
public class CastingEx01 {

    public static void attack(Protoss p){
        p.attack();
    }

    public static void main(String[] args) {
        attack(new Zealot());
        attack(new Dragoon());
    }
}

