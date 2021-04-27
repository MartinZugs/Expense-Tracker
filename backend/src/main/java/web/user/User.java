package web.user;

import java.util.ArrayList;
import java.util.List;

public class User {

    private List<Budget> budgets = new ArrayList<Budget>();
    private List<Loan> loans = new ArrayList<Loan>();

    long id;
    String name;
    String email;

    public User(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public boolean createBudget(Budget budget) {
        return budgets.add(budget);
    }

    public boolean deleteBudget(Budget budget) {
        return budgets.remove(budget);
    }

    public boolean createLoan(Loan loan) {
        return loans.add(loan);
    }

    public boolean deleteLoan(Loan loan) {
        return loans.remove(loan);
    }

    /* ------ Getter & Setter ------ */
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Budget> getBudgets() {
        return budgets;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }
}
