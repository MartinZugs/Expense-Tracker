package web.user;

import java.util.LinkedList;
import java.util.List;

import web.account.Account;
import web.account.AccountService;
import web.account.AccountType;
import web.database.*;

public class UserService implements UserServiceInterface{

    private final List<User> users = new LinkedList<>();
    DatabaseController database_controller = new DatabaseController("expense_tracker");
    User return_user;
    long id;
    String name;
    String email;

    /* ------- User methods ------- */
    public boolean createUser (User user) {
        database_controller.open_connection();
        int affected_rows = database_controller.execute_update("INSERT INTO User (name, email) VALUES ('" + user.getName() + "','" + user.getEmail() + "');");
        System.out.println(affected_rows);
        database_controller.close_connection();

        return users.add(user);
    }

    public User getUser (long user_id) {
        /*try{
        database_controller.open_connection();
        ResultSet result = database_controller.execute_query("SELECT * FROM User WHERE user_id = " + String.valueOf(user_id) + ";");
        while (result.next()) {
                this.id = result.getInt("user_id");
                this.name = result.getString("name");
                this.email = result.getString("email");
                System.out.println(this.id + "," + this.name + "," + this.email);
            }
        database_controller.close_connection();
        }
        catch (Exception e){e.printStackTrace();}
        return new User(this.id, this.name, this.email);*/
        return users.stream().filter(usr -> usr.getId() == user_id).findFirst().orElse(null);
    }

    public double getDebt(long user_id, AccountService account_service) {
        double debt = 0;
        User usr = getUser(user_id);
        for(Loan loan : usr.getLoans()) {
            debt += (loan.getAmount() - loan.getPaid_off());
        }
        for(Account account : account_service.getAccounts(user_id)) {
            if(account.getType().equals(AccountType.CREDIT)) {
                debt += account.getBalance();
            }
        }
        return debt;
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
