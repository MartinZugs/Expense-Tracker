package web.transaction;

import web.transaction.Transaction;

public interface TransactionServiceInterface {

    Transaction createTransaction(Transaction transaction, long account_id);
}
