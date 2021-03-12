package web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ExpenseController implements ExpenseServiceInterface {

    ExpenseService expense_service = new ExpenseService();

    @GetMapping("/new")
    public boolean createExpense() {
        System.out.println("New expense added!");
        return expense_service.createExpense();
    }
}
