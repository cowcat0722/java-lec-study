package ex08.example2;



class Cal2{
    public void divide(int num) throws Exception{ // thrwos하면 사용자가 try catch를 써서 예외를 사용자가 처리 가능
        System.out.println(10/num);
    }
}

public class TryEx01 {
    public static void main(String[] args) {
        Cal2 c2 = new Cal2();
        try {
            c2.divide(0);
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없어요");
        }
    }
}
