package ex08;

class Account extends Object{
    private String author;
    private int number;
    private int balance;

    public Account(String author, int number, int balance) {
        this.author = author;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}

public class ObEx01 {
    public static void main(String[] args) {
        Account account = new Account("홍길동",1111,1000);
        Account account2 = new Account("홍길동",1111,1000);
        System.out.println(account);
        System.out.println(account2);

        // == 은 프리밋티브일 때는 값 비교, 레퍼런스일 때는 주소 비교
        if(account == account2){
            System.out.println("같아요");
        }

        // account -> equals() (오브젝트) (주소비교)
        // account.toString -> equlas() (주소비교 and 값비교)
        if(account.toString().equals(account2.toString())){
            System.out.println("같아요2");
        }
    }
}
