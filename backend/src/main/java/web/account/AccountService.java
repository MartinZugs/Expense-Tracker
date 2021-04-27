package web.account;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import web.database.*;

public class AccountService implements AccountServiceInterface{

    private final List<Account> accounts = new LinkedList<>();
    DatabaseController database_controller = new DatabaseController("expense_tracker");

    public boolean createAccount (Account account) {
        database_controller.open_connection();
        int affected_rows = database_controller.execute_update("INSERT INTO Account (name, type, balance, user_id) VALUES ('" + account.getName() + "','" + account.getType() + "','" + account.getBalance() + "','" + account.getUser_id() + "');");
        System.out.println(affected_rows);
        database_controller.close_connection();
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
