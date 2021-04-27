package web.transaction;

import web.account.*;
import web.user.UserService;

import java.util.LinkedList;
import java.util.List;

import java.sql.*;
import web.database.*;

public class TransactionService implements TransactionServiceInterface {

    private final List<Transaction> transactions = new LinkedList<>();
    DatabaseController database_controller = new DatabaseController("expense_tracker");

    public boolean createTransaction(Transaction transaction, AccountService account_service, UserService user_service) {
        // Convert to a SQL date 
        java.sql.Date sqlDate = new java.sql.Date(transaction.getDate().getTime());
        // Convert the boolean to a usable format for SQL
        int is_bill = (transaction.isBill()) ? 1 : 0;
        database_controller.open_connection();
        int affected_rows = database_controller.execute_update("INSERT INTO Transaction (date, value, category, isBill, account_id) VALUES ('" + sqlDate + "','" + transaction.getValue() + "','" + transaction.getCategory() + "','" + is_bill + "','" + transaction.getAccount_id() + "');");
        System.out.println(affected_rows);
        database_controller.close_connection();
        // update balance for account associated with transaction
        Account acc = account_service.getAccount(transaction.getAccount_id());
        acc.updateBalance(transaction.getValue());
        // update amount for budget associated with transaction
        //if(transaction.getBudget_id() != 0) {
            //user_service.getBudget(acc.getUser_id(), transaction.getBudget_id()).updateBudget(transaction.getValue());
        //}
        return transactions.add(transaction);
    }

    public Transaction getTransaction(long transaction_id) {
        return transactions.stream().filter(tran -> transaction_id == tran.getId()).findFirst().orElse(null);
    }
}
