package web;

import web.account.*;
import web.user.*;
import web.transaction.*;
import web.bill.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/* public class ConnectToDatabase {
   public static void main(String[] args) {
      String MySQLURL = "jdbc:mysql://localhost:3306/web?useSSL=false";
      String databseUserName = "root";
      String databasePassword = "123456";
      Connection con = null;
      try {
         con = DriverManager.getConnection(MySQLURL, databseUserName, databasePassword);
         if (con != null) {
            System.out.println("Database connection is successful !!!!");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
} */


@RestController
public class SpringController {

    UserService user_service = new UserService();
    AccountService account_service = new AccountService();
    TransactionService transaction_service = new TransactionService();
    BillService bill_service = new BillService();


    /* ---------- User API ----------- */
    @PutMapping(
            value = "/user/new",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean createUser(@RequestBody User user) {
        String MySQLURL = "jdbc:mysql://localhost:3306/test?useSSL=false";
        String databseUserName = "root";
        String databasePassword = "";
        Connection con = null;
        try {
            con = DriverManager.getConnection(MySQLURL, databseUserName, databasePassword);
            if (con != null) {
                System.out.println("Database connection is successful !!!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user_service.createUser(user);
    }

    @GetMapping(
            value = "/user/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable long user_id){
        return user_service.getUser(user_id);
    }

    /* ----------- Budget API (User Service) ---------- */
    @PutMapping(
            value = "/budget/new",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean createBudget(@RequestBody Budget budget) {
        return user_service.createBudget(budget);
    }

    @GetMapping(
            value = "/budget/{user_id}/{budget_id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Budget getBudget(@PathVariable long user_id, @PathVariable long budget_id){
        return user_service.getBudget(user_id, budget_id);
    }

    @DeleteMapping(value = "/budget/delete/{user_id}/{budget_id}")
    public boolean deleteBudget(@PathVariable long user_id, @PathVariable long budget_id) {
        return user_service.deleteBudget(user_id, budget_id);
    }

    /* -------------- Loan API (User Service) ----------- */
    @PutMapping(
            value = "/loan/new",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean createLoan(@RequestBody Loan loan) {
        return user_service.createLoan(loan);
    }

    @GetMapping(
            value = "/loan/{user_id}/{loan_id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Loan getLoan(@PathVariable long user_id, @PathVariable long loan_id){
        return user_service.getLoan(user_id, loan_id);
    }

    @DeleteMapping(value = "/loan/delete/{user_id}/{loan_id}")
    public boolean deleteLoan(@PathVariable long user_id, @PathVariable long loan_id) {
        return user_service.deleteLoan(user_id, loan_id);
    }

    @GetMapping(value = "/loan/update/{user_id}/{loan_id}/{update_amount}")
    public double updateLoan(@PathVariable long user_id, @PathVariable long loan_id, @PathVariable double update_amount) {
        return user_service.updateLoan(user_id, loan_id, update_amount);
    }

    /* ---------- Transaction API ----------- */
    @PutMapping(
            value = "/transaction/new/",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean createTransaction(@RequestBody Transaction transaction) {
        return transaction_service.createTransaction(transaction, account_service, user_service);
    }

    @GetMapping(
            value = "/transaction/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Transaction getTransaction(@PathVariable long transaction_id){
        return transaction_service.getTransaction(transaction_id);
    }


    /* ----------- Account API ------------- */
    @PutMapping(
            value = "/account/new",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean createAccount(@RequestBody Account account) {
        return account_service.createAccount(account);
    }

    @GetMapping(
            value = "/account/{id}", 
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Account getAccount(@PathVariable long account_id){
        return account_service.getAccount(account_id);
    }

    @GetMapping(
            value = "/user/{id}/accounts",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Account> getAccounts(@PathVariable long user_id){
        return account_service.getAccounts(user_id);
    }

    @GetMapping(
            value = "user/{id}/assets",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public double getAssets(@PathVariable long user_id) {
        return account_service.getAssets(user_id);
    }

    
    /* ---------- Bill API ----------- */
    @PutMapping(
            value = "/bill/new",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean createBill(@RequestBody Bill bill) {
        return bill_service.createBill(bill);
    }

    @GetMapping(
            value = "/bill/{id}", 
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Bill getBill(@PathVariable long bill_id){
        return bill_service.getBill(bill_id);
    }
}