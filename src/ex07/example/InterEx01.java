package ex07.example;

interface Remocon{
    void on();
    void off();
}

class SamsongRemocon implements Remocon{

    @Override
    public void on() {
        System.out.println("삼성 리모컨 On");
    }

    @Override
    public void off() {
        System.out.println("삼성 리모컨 Off");
    }
}

class LgRemocon implements Remocon{


    @Override
    public void on() {
        System.out.println("엘지 리모컨 On");
    }

    @Override
    public void off() {
        System.out.println("엘지 리모컨 Off");
    }
}

/**
 * 작성자 : 홍길동
 * 날짜 : 2023.12.26
 * 구현체 : SaumsungRemot, LgRemocon
 */
class CommonRemocon{
    private Remocon r;

    public CommonRemocon(Remocon r) {
        this.r = r;
    }

    public void on(){
        r.on();
    }
    public void off(){
        r.off();
    }
}

public class InterEx01 {

    public static void main(String[] args) {
        CommonRemocon cr = new CommonRemocon(new SamsongRemocon());
        cr.on();
    }
}
