package web.transaction;

public interface TransactionServiceInterface {

    Transaction createTransaction(Transaction transaction, long account_id);
}
