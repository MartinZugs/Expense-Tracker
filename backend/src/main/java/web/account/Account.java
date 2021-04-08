package web.account;

public class Accounts {

    long id;
    String name;
    AccountType type;

    public Accounts(long id, String name, AccountType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Accounts(long id, String name) {
        this.id = id;
        this.name = name;
        this.type = AccountType.OTHER;
    }
}
