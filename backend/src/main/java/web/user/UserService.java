package web.user;

import java.util.LinkedList;
import java.util.List;

public class UserService {

    private final List<User> users = new LinkedList<>();

    public User createUser (User user) {
        users.add(user);
        return user;
    }
}
