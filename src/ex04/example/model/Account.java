package ex04.example.model;

public class Account {
    public final int id; // 계좌번호 (숫자 4자리로 만들어져있다.)
    public long balance;
    public int userId; // 1 -> ssar

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
