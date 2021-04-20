package web;

import web.account.*;
import web.user.*;
import web.transaction.*;
import web.bill.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;


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
        return user_service.createUser(user);
    }

    @GetMapping(
            value = "/user/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable long user_id){
        return user_service.getUser(user_id);
    }


    /* ---------- Transaction API ----------- */
    @PutMapping(
            value = "/transaction/new/",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean createTransaction(@RequestBody Transaction transaction) {
        return transaction_service.createTransaction(transaction);
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