package web.account;

import java.util.LinkedList;
import java.util.List;

public class AccountService {

    private final List<Account> accounts = new LinkedList<>();

    public Account createAccount (Account account, long user_id) {
        accounts.add(account);
        return account;
    }
}
