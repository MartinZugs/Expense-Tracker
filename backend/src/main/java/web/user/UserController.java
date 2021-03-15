package web.user;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {

    UserService user_service = new UserService();

    @PutMapping(
            value = "/user/new",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User createAccount(@RequestBody User user) {
        System.out.println("New User added!");
        return user_service.createUser(user);
    }
}
