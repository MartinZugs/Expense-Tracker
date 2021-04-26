package web;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

import web.account.Account;
import web.account.AccountService;
import web.account.AccountType;
import web.bill.BillService;
import web.transaction.Transaction;
import web.transaction.TransactionCategory;
import web.transaction.TransactionService;
import web.user.Loan;
import web.user.User;
import web.user.UserService;

public class APITest {

    UserService user_service = new UserService();
    AccountService account_service = new AccountService();
    TransactionService transaction_service = new TransactionService();
    BillService bill_service = new BillService();

    User user_1 = new User(1, "Max Smith", "max.smith@online.com");
    Account user_1_acc1 = new Account(1, "Chase Checking", AccountType.CHECKINGS, 1, 0.00);
    Account user_1_acc2 = new Account(2, "Chase Savings", AccountType.SAVINGS, 1, 100.00);
    Account user_1_acc3 = new Account(3, "Chase Credit Card", AccountType.CREDIT, 1, 50.00);
    Transaction user_1_trans1 = new Transaction(1, 200.00, TransactionCategory.HOUSING, false, 1);
    Transaction user_1_trans2 = new Transaction(2, 50.00, TransactionCategory.FOOD, false, 3);
    Loan user_1_loan1 = new Loan(1, 1, 5000.00, 1500.00, new Date(), 1.5, "2010 Mercedes");
    Loan user_1_loan2 = new Loan(2, 1, 100000.00, 6000.00, new Date(), 0.8, "Chicago Apartment");



    User user_2 = new User(2, "John Richards", "jr@online.com");
    Account user_2_acc = new Account(4, "Bank of America Checking", AccountType.CHECKINGS, 2, 200.00);
    Transaction user_2_trans = new Transaction(3, -35.20, TransactionCategory.OTHER, false, 4);
    Loan user_2_loan = new Loan(3, 2, 12500.00, 11500.00, new Date(), 0.5, "Kitchen");

    @Test
    public void Creation_Test() {
        assertTrue(user_service.createUser(user_1));
        assertTrue(account_service.createAccount(user_1_acc1));
        assertTrue(account_service.createAccount(user_1_acc2));
        assertTrue(account_service.createAccount(user_1_acc3));
        assertTrue(transaction_service.createTransaction(user_1_trans1, account_service, user_service));
        assertTrue(transaction_service.createTransaction(user_1_trans1, account_service, user_service));
        assertTrue(user_service.createLoan(user_1_loan1));
        assertTrue(user_service.createLoan(user_1_loan2));
        assertEquals(user_service.getUser(1), user_1);
        assertEquals(account_service.getAccount(1), user_1_acc1);
        assertEquals(account_service.getAccount(2), user_1_acc2);
        assertEquals(account_service.getAccount(3), user_1_acc3);
        assertEquals(transaction_service.getTransaction(1), user_1_trans1);
        assertEquals(transaction_service.getTransaction(2), user_1_trans2);
        assertEquals(user_service.getLoan(user_1.getId(), 1), user_1_loan1);
        assertEquals(user_service.getLoan(user_1.getId(), 1), user_1_loan1);
    }

    @Test
    public void simpleUserTest() {
        assertTrue(user_service.createUser(user_2));
        assertEquals(user_service.getUser(2), user_2);

        assertTrue(account_service.createAccount(user_2_acc));
        Account acc = account_service.getAccount(4);
        assertEquals(acc, user_2_acc);
        // Test account balance
        assertEquals(acc.getBalance(), user_2_acc.getBalance());
        assertEquals(acc.getBalance(), 200.00);
        assertTrue(transaction_service.createTransaction(user_2_trans, account_service, user_service));
        // Test updated account balance after transaction
        Transaction trans = transaction_service.getTransaction(3);
        assertEquals(trans, user_2_trans);
        assertEquals(acc.getBalance(), 164.8);
        // Test user debt
        assertTrue(user_service.createLoan(user_2_loan));
        Loan loan = user_service.getLoan(user_2.getId(), user_2_loan.getId());
        assertEquals(loan, user_2_loan);
        assertEquals(user_service.getDebt(2, account_service), (loan.getAmount() - loan.getPaid_off()));
        assertEquals(user_service.getDebt(2, account_service), 1000);
    }
    
}
