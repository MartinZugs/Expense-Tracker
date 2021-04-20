package web.transaction;

import java.util.LinkedList;
import java.util.List;

public class TransactionService implements TransactionServiceInterface {

    private final List<Transaction> transactions = new LinkedList<>();

    public boolean createTransaction(Transaction transaction) {
        return transactions.add(transaction);
    }

    public Transaction getTransaction(long transaction_id) {
        return transactions.stream().filter(tran -> transaction_id == tran.getId()).findFirst().orElse(null);
    }
}
