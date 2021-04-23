package web.transaction;

import web.account.*;
import web.user.UserService;

public interface TransactionServiceInterface {

    public boolean createTransaction(Transaction transaction, AccountService account_service, UserService user_service);
    public Transaction getTransaction(long transaction_id);
}
