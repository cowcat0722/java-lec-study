package ex02;

/**
 * 변수 작성법
 * 1. 카멜 표기법을 사용한다.
 * 2. 숫자를 먼저 사용하지 않는다.
 * 3. 특수문자는 사용하지 않는다.
 */
public class IdenEx01 {
    public static void main(String[] args) {
        // int public; // 오류
        int user_money; // 되지만 절대 사용안함!!!
        int userMoney; // Camel 표기법을 사용함
        // int abc#; // # 오류
        int method;
        double abc$$; // 특수문자 사용하지 말자
        // int 1stMoney; // 숫자로 변수를 시작하는것은 안됨
    }
}
