package web.user;

import java.util.LinkedList;
import java.util.List;
import java.sql.*;

public class UserService implements UserServiceInterface{

    private final List<User> users = new LinkedList<>();
    // DatabaseController database_controller = new DatabaseController();

    /* ------- User methods ------- */
    public boolean createUser (User user) {
        // ResultSet result = database_controller.execute_query("INSERT INTO User (name, email) VALUES (" + user.getName() + "," + user.getEmail() + ");");
        return users.add(user);
    }

    public User getUser (long user_id) {
        return users.stream().filter(usr -> usr.getId() == user_id).findFirst().orElse(null);
    }

    /* ------- Budget methods ------- */

    public boolean createBudget(Budget budget) {
        return getUser(budget.getUser_id()).createBudget(budget);
    }

    public Budget getBudget(long user_id, long budget_id) {
        return getUser(user_id).getBudgets().stream().filter(bud -> bud.getId() == budget_id).findFirst().orElse(null);
    }

    public boolean deleteBudget(long user_id, long budget_id) {
        return getUser(user_id).deleteBudget(getBudget(user_id, budget_id));
    }

    /* ------- Loan methods ------- */

    public boolean createLoan(Loan loan) {
        return getUser(loan.getUser_id()).createLoan(loan);
    }

    public Loan getLoan(long user_id, long loan_id) {
        return getUser(user_id).getLoans().stream().filter(loan -> loan.getId() == loan_id).findFirst().orElse(null);
    }

    public boolean deleteLoan(long user_id, long loan_id) {
        return getUser(user_id).deleteLoan(getLoan(user_id, loan_id));
    }

    public double updateLoan(long user_id, long loan_id, double value) {
        return getLoan(user_id, loan_id).update(value);
    }
}
