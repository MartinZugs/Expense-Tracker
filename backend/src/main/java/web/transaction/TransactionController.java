package web.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController implements TransactionServiceInterface {

    TransactionService expense_service = new TransactionService();

    @PutMapping(
            value = "/transactions/new/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Transaction createTransaction(@RequestBody Transaction transaction, @PathVariable long account_id) {
        System.out.println("New transaction added!");
        return expense_service.createTransaction(transaction, account_id);
    }
}
