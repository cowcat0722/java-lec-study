package ex04.example;

import ex04.example.model.Account;
import ex04.example.model.User;

public class BankApp {
    public static void main(String[] args) {
        // 1. 고객 2명 만들기
        User ssar = new User(1,"Ssar","ssar@nate.com");
        User bori = new User(1,"Bori","bori@nate.com");

        // 2. 계좌 2개 만들기
        Account ssarAccount = new Account(1111,1000L,1);
        Account boriAccount = new Account(2222,1000L,2);

        // 3. 고객에게 정보를 받기 (sender, receiver, amount)
        long amount = 100L;

        // 4. 이체 (ssar -> bori 이체)
        BankService.이체(ssarAccount,boriAccount,amount);

        // 5. 객체 상태 확인.
        System.out.println(ssarAccount);
        System.out.println(boriAccount);

        // 6. 출금
        BankService.출금(ssarAccount, amount);


    }
}
