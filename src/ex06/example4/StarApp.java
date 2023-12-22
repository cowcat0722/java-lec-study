package ex06.example4;

public class StarApp {
    // 오버로딩의 한계가 있음
    public static void gameStart(Protoss u1, Protoss u2){
        u1.attack();
        u2.attack();
        System.out.println();
    }


    public static void main(String[] args) {
        Protoss z1 = new Zealot("z1"); // [Zealot, Protoss]
        Dragoon d1 = new Dragoon("d1"); // [Dargoon, Protoss]
        River r1 = new River("r1"); // [River, Protoss]
        Dark dark1 = new Dark("d1"); // [Dark, Protoss]

        gameStart(z1,d1);
        gameStart(dark1,d1);

    }
}
