package web.transaction;

public interface TransactionServiceInterface {

    public boolean createTransaction(Transaction transaction);
    public Transaction getTransaction(long transaction_id);
}
