package web;

import web.account.*;
import web.user.*;
import web.transaction.*;
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


    /* ---------- User API ----------- */
    @GetMapping(
            value = "/user/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable long user_id){
        return new User(user_id, "Max", "Mustermann", "max@mustermann.com");
    }

    @PutMapping(
            value = "/user/new",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User createUser(@RequestBody User user) {
        return user_service.createUser(user);
    }


    /* ---------- Transaction API ----------- */
    @PutMapping(
            value = "/transaction/new/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Transaction createTransaction(@RequestBody Transaction transaction, @PathVariable long account_id) {
        return transaction_service.createTransaction(transaction, account_id);
    }


    /* ----------- Account API ------------- */
    @GetMapping(value = "/account/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Account getAccount(@PathVariable long account_id){
        return account_service.getAccount(account_id);
    }

    @PutMapping(
            value = "/account/new",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Account createAccount(@RequestBody Account account) {
        return account_service.createAccount(account);
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
}