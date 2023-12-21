package ex04.example;

import ex04.example.model.Account;
import ex04.example.model.User;

public class BankApp {
    public static void main(String[] args) {
        // 고객 2명 만들기
        User u1 = new User(1, "ssar", "ssar@nate.com");
        User u2 = new User(2, "cos", "cos@nate.com");

        // 계좌 2개 만들기
        Account a1 = new Account(1111, 1000L, 1);
        Account a2 = new Account(2222, 1000L, 2);

        // 고객에게 받은 정보
        int amount = 100;
        int sender = 1111;
        int receiver = 2222;

        // 일의 최소 단위 == 트랜잭션
        // 계좌이체 하기 ------------------------------------------
        // 0원 검증
        if (amount <= 0) {
            System.out.println("0원 이하 금액을 이체할 수 없습니다");
            return;
        }

        // 잔액 검증
        if (a1.balance < amount) {
            System.out.println("잔액부족");
            return;
        }

        // 계좌번호 검증
        if (a1.id != sender) {
            System.out.println("보내는 사람 계좌번호는 존재하지 않습니다");
            return;
        }

        if (a2.id != receiver) {
            System.out.println("받는 사람 계좌번호는 존재하지 않습니다");
            return;
        }

        // 이체
        a1.balance = a1.balance - amount;
        a2.balance = a2.balance + amount;

        // 이체결과 확인
        System.out.println(a1);
        System.out.println(a2);
    }
}
