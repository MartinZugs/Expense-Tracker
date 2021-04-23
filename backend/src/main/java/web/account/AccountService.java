package web.account;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AccountService implements AccountServiceInterface{

    private final List<Account> accounts = new LinkedList<>();

    public boolean createAccount (Account account) {
        return accounts.add(account);
    }

    public Account getAccount (long account_id) {
        return accounts.stream().filter(acc -> account_id == acc.getId()).findFirst().orElse(null);
    }

    public List<Account> getAccounts (long user_id) {
        return accounts.stream().filter(acc -> acc.getUser_id() == user_id).collect(Collectors.toList());
    }

    public double getAssets (long user_id) {
        return getAccounts(user_id).stream().mapToDouble(Account::getBalance).sum();
    }
}
