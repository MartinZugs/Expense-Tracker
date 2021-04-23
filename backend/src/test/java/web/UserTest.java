package web;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import web.user.User;
import web.user.UserService;

public class UserTest {

    User user_1 = new User(1, "Max", "Smith", "max.smith@online.com");
    User user_2 = new User(2, "John", "Richards", "jr@online.com");
    UserService user_service = new UserService();

    @Test
    public void main_test() {
        assertTrue(user_service.createUser(user_1));
        assertTrue(user_service.createUser(user_2));
        assertEquals(user_service.getUser(1), user_1);
        assertEquals(user_service.getUser(2), user_2);
        assertNotEquals(user_service.getUser(1), user_2);
        assertNotEquals(user_service.getUser(2), user_1);
    }
    
}
