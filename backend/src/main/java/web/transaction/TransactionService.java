package web.transaction;

import web.account.*;
import java.util.LinkedList;
import java.util.List;

public class TransactionService implements TransactionServiceInterface {

    private final List<Transaction> transactions = new LinkedList<>();

    public boolean createTransaction(Transaction transaction, AccountService account_service) {
        // update balance for account associated with transaction
        Account acc = account_service.getAccount(transaction.getAccount_id());
        acc.updateBalance(transaction.getValue());
        return transactions.add(transaction);
    }

    public Transaction getTransaction(long transaction_id) {
        return transactions.stream().filter(tran -> transaction_id == tran.getId()).findFirst().orElse(null);
    }
}
