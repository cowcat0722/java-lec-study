package ex03.example;

import ex03.example.model.Account;
import ex03.example.model.User;

// 메인
public class BankApp {
    public static void main(String[] args) {
        User ssar = new User(1,"ssar","ssar@nate.com");
        User bori = new User(2,"bori","bori@nate.com");

        Account ssarAccount = new Account(1111,10000L,1);
        Account boriAccount = new Account(2222,10000L,2);


        BankService.이체(ssarAccount,boriAccount,100L);
        System.out.println(ssarAccount);
        System.out.println(boriAccount);



    }
}
