package web.account;

import java.util.LinkedList;
import java.util.List;

public class AccountService {

    private final List<Accounts> accounts = new LinkedList<>();

    public Accounts createAccount (Accounts account, long user_id) {
        accounts.add(account);
        return account;
    }
}
