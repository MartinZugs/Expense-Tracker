package web;

import org.springframework.web.bind.annotation.*;

@RestController
public class ExpenseController implements ExpenseServiceInterface {

    ExpenseService expense_service = new ExpenseService();

    @GetMapping("/new")
    public boolean createExpense() {
        System.out.println("New expense added!");
        return expense_service.createExpense();
    }
}
