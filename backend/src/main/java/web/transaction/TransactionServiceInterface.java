package web.transaction;

import web.account.*;

public interface TransactionServiceInterface {

    public boolean createTransaction(Transaction transaction, AccountService account_service);
    public Transaction getTransaction(long transaction_id);
}
