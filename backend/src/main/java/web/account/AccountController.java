package web.account;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AccountController {

    AccountService account_service = new AccountService();

    @PutMapping(
            value = "/account/new/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Accounts createAccount(@RequestBody Accounts account, @PathVariable long user_id) {
        System.out.println("New Accounts added!");
        return account_service.createAccount(account, user_id);
    }
}
