package ex05;

class President {

    static President instance = new President();

    private President(){}
}

public class SingleTonEx01 {
    public static void main(String[] args) {
        President p1 = President.instance;
        System.out.println(p1.hashCode());

        President p2 = President.instance;
        System.out.println(p2.hashCode()); // 해쉬코드 알려주는 코드
    }
}
