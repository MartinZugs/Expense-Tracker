package web.user;

import java.util.LinkedList;
import java.util.List;

public class UserService implements UserServiceInterface{

    private final List<User> users = new LinkedList<>();

    public boolean createUser (User user) {
        return users.add(user);
    }

    public User getUser (long user_id) {
        return users.stream().filter(usr -> usr.getId() == user_id).findFirst().orElse(null);
    }
}
