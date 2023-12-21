package ex03.example.model;

public class Account {
    private final int id;
    private long balance;
    private int userId;

    public void 출금(long amount){
        this.balance = this.balance - amount;
    }

    public void 입금(long amount){
        this.balance = this.balance + amount;
    }

    public boolean 잔액부족하니(long amount){
        if(this.balance < amount){
            return true;
        }
        return false;
    }

    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
