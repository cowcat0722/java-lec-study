package ex04.example;

import ex04.example.model.Account;

// 트랜잭션 관리
public class BankService {

    public static void 출금(Account withdrawAccount, long amount){
        if(amount <= 0){
            System.out.println("0원 이하 금액은 출금할 수 없습니다.");
            return;
        }

        if(withdrawAccount.잔액부족하니(amount)){
            System.out.println("잔액이 부족합니다.");
            return;
        }

        withdrawAccount.출금(amount);
    }

    public static void 이체(Account senderAccount, Account receiverAccount, long amount){
        if(amount <= 0){
            System.out.println("0원 이하 금액은 이체할 수 없습니다.");
            return; // 프로그램 끝냄
        }

        if(senderAccount.잔액부족하니(amount)){
            System.out.println("잔액이 부족합니다.");
            return;
        }

        senderAccount.출금(amount);
        receiverAccount.입금(amount);
    }
}
