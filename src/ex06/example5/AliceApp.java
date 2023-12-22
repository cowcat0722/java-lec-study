package ex06.example5;

abstract class 판사{ // abstract(추상) class는 Object가 아님 -> new 할 수 없다.
    public abstract void 심문();
}

abstract class 증인{ // 독립적으로 뜨는 방법은 없다. 상속을 해서 뛰어야만 뜰 수 있다.
    public abstract void 대답();
}

class 왕 extends 판사{
    public void 심문(){
        System.out.println("왕은 심문한다.");
    }
}
class 왕비 extends 판사{
    public void 심문(){
        System.out.println("왕비는 심문한다.");
    }
}

class 모자장수 extends 증인{
    public void 대답(){
        System.out.println("모자장수는 대답한다.");
    }
}
class 토끼 extends 증인{
    public void 대답(){
        System.out.println("토끼는 대답한다.");
    }
}
class 엘리스 extends 증인{
// 엘리스에 커서 올리고 Alt+Enter 하면 바로 만들어짐.
    @Override
    public void 대답() {
        System.out.println("엘리스는 대답한다.");
    }
}

public class AliceApp {
    public static void main(String[] args) {
        판사 u1 = new 왕비(); // [판사, 왕비]
        증인 u2 = new 엘리스(); // [증인, 토끼]

        u1.심문();
        u2.대답();
    }
}
