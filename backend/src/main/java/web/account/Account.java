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
        this.type = AccountType.OTHER;
        this.user_id = user_id;
        this.balance = balance;
    }

    public void updateBalance(double value) {
        this.balance += value;
    }

    /* ------------- Getter & Setter --------- */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
