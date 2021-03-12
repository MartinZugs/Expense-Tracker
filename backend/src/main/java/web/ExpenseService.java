package web;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ExpenseService implements ExpenseServiceInterface {

    private List<Expense> expenses = new LinkedList<>();

    public boolean createExpense () {
        return expenses.add(new Expense());
    }
}
