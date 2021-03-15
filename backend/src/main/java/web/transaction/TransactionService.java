package web.transaction;

import java.util.LinkedList;
import java.util.List;

public class TransactionService implements TransactionServiceInterface {

    private final List<Transaction> transactions = new LinkedList<>();

    public Transaction createTransaction (Transaction transaction, long account_id) {
        transactions.add(transaction);
        return transaction;
    }
}
