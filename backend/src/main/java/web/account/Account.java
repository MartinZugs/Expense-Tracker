package web.account;

public class Account {

    long id;
    String name;
    AccountType type;
    long user_id;
    double balance;

    public Account(long id, String name, AccountType type, long user_id, double balance) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.user_id = user_id;
        this.balance = balance;
    }

    public Account(long id, String name, long user_id, double balance) {
        this.id = id;
        this.name = name;
        this.user_id = user_id;
        this.balance = balance;
        this.type = AccountType.OTHER;
    }

    public void updateBalance(double value) {
        this.balance += value;
    }

    /* ------ Getter & Setter ------ */
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public AccountType getType() {
        return type;
    }

    public long getUser_id() {
        return user_id;
    }

    public double getBalance() {
        return balance;
    }
}
