package web.user;

import java.util.LinkedList;
import java.util.List;

public class User {

    private List<Budget> budgets = new LinkedList<Budget>();
    private List<Loan> loans = new LinkedList<Loan>();

    long id;
    String first_name;
    String last_name;
    String email;

    public User(long id, String first_name, String last_name, String email) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
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

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
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
