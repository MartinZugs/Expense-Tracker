package web.account;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import web.database.*;

public class AccountService implements AccountServiceInterface{

    private final List<Account> accounts = new LinkedList<>();
    DatabaseController database_controller = new DatabaseController("expense_tracker");
    long id;
    String name;
    AccountType type;
    long user_id;
    double balance;

    public boolean createAccount (Account account) {
        database_controller.open_connection();
        int affected_rows = database_controller.execute_update("INSERT INTO Account (name, type, balance, user_id) VALUES ('" + account.getName() + "','" + account.getType() + "','" + account.getBalance() + "','" + account.getUser_id() + "');");
        System.out.println(affected_rows);
        database_controller.close_connection();
        return accounts.add(account);
    }

    public Account getAccount (long account_id) {
        /*try{
        database_controller.open_connection();
        ResultSet result = database_controller.execute_query("SELECT * FROM Account WHERE account_id = " + String.valueOf(account_id) + ";");
        while (result.next()) {
                this.id = result.getInt("account_id");
                this.name = result.getString("name");
                this.type = result.getString("type");
                this.user_id = result.getInt("user_id");
                this.balance = result.getInt("email");
            }
        database_controller.close_connection();
        }
        catch (Exception e){e.printStackTrace();}
        return new Account(this.id, this.name, this.type, this.user_id. this.balance);*/
        return accounts.stream().filter(acc -> account_id == acc.getId()).findFirst().orElse(null);
    }

    public List<Account> getAccounts (long user_id) {
        return accounts.stream().filter(acc -> acc.getUser_id() == user_id).collect(Collectors.toList());
    }

    public double getAssets (long user_id) {
        return getAccounts(user_id).stream().mapToDouble(Account::getBalance).sum();
    }
}
