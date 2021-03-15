package web.account;

public class Account {

    long id;
    String name;
    AccountType type;

    public Account(long id, String name, AccountType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Account(long id, String name) {
        this.id = id;
        this.name = name;
        this.type = AccountType.OTHER;
    }
}
