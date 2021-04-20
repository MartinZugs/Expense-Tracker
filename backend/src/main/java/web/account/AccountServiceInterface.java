package web.account;

import java.util.List;

public interface AccountServiceInterface {

    public boolean createAccount (Account account);
    public Account getAccount (long account_id);
    public List<Account> getAccounts (long user_id);
    public double getAssets (long user_id);
}
