package web.user;

import java.util.LinkedList;
import java.util.List;

public class UserService implements UserServiceInterface{

    private final List<User> users = new LinkedList<>();

    /* ------- User methods ------- */
    public boolean createUser (User user) {
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
}
