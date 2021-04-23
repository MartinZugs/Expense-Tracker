package web.user;

public interface UserServiceInterface {

    public boolean createUser(User user);
    public User getUser (long user_id);
    /* ------- Budget methods -------- */
    public boolean createBudget(Budget budget);
    public Budget getBudget(long user_id, long budget_id);
    public boolean deleteBudget(long user_id, long budget_id);
    /* ------- Loan methods ------- */
    public boolean createLoan(Loan loan);
    public Loan getLoan(long user_id, long loan_id);
    public boolean deleteLoan(long user_id, long loan_id);
}
