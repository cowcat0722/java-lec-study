package ex04;

public class Television {

     int chnnel; // 채널 번호
     int volume; // 볼륨
     boolean onOff; // 전원 상태

    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.chnnel = 7;
        myTv.volume = 10;
        myTv.onOff = true;

        Television yourTv = new Television();
        yourTv.chnnel = 9;
        yourTv.volume = 12;
        yourTv.onOff = true;
        System.out.println("나의 텔레비젼의 채널은 "+myTv.chnnel+"이고 볼륨은 "+myTv.volume+"입니다.");
        System.out.println("너의 텔레비젼의 채널은 "+yourTv.chnnel+"이고 볼륨은 "+yourTv.volume+"입니다.");

    }
}
