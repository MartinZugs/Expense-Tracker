package web.transaction;

import web.account.*;
import web.user.UserService;

import java.util.LinkedList;
import java.util.List;

public class TransactionService implements TransactionServiceInterface {

    private final List<Transaction> transactions = new LinkedList<>();

    public boolean createTransaction(Transaction transaction, AccountService account_service, UserService user_service) {
        // update balance for account associated with transaction
        Account acc = account_service.getAccount(transaction.getAccount_id());
        acc.updateBalance(transaction.getValue());
        // update amount for budget associated with transaction
        if(transaction.getBudget_id() != 0) {
            user_service.getBudget(acc.getUser_id(), transaction.getBudget_id()).updateBudget(transaction.getValue());
        }
        return transactions.add(transaction);
    }

    public Transaction getTransaction(long transaction_id) {
        return transactions.stream().filter(tran -> transaction_id == tran.getId()).findFirst().orElse(null);
    }
}
