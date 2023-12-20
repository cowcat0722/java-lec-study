package ex04;
class Television01 {
    private int channel;
    private int volume;
    private boolean onOff;

    Television01(int c, int v, boolean o){
        channel = c;
        volume = v;
        onOff = o;
    }
    void print(){
        System.out.println("채널은 "+channel+"이고 볼륨은 "+volume+"입니다.");
    }
}
public class TelevisionTest {
    public static void main(String[] args) {
        Television01 myTv = new Television01(7,10,true);
        myTv.print();

        Television01 yourTv = new Television01(11,20,true);
        yourTv.print();
    }
}
