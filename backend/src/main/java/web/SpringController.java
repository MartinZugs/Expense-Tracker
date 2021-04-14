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
    public User createAccount(@RequestBody User user) {
        System.out.println("New User added!");
        return user_service.createUser(user);
    }


    /* ---------- Transaction API ----------- */
    @PutMapping(
            value = "/transaction/new/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Transaction createTransaction(@RequestBody Transaction transaction, @PathVariable long account_id) {
        System.out.println("New transaction added!");
        return transaction_service.createTransaction(transaction, account_id);
    }


    /* ----------- Account API ------------- */
    @GetMapping(value = "/account", produces = MediaType.APPLICATION_JSON_VALUE)
    public Account getAccount(){
        System.out.println("Returning account data ...");
        return new Account(2, "savings", AccountType.OTHER);
    }

    @PutMapping(
            value = "/account/new/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Account createAccount(@RequestBody Account account, @PathVariable long user_id) {
        System.out.println("New Account added!");
        return account_service.createAccount(account, user_id);
    }
}