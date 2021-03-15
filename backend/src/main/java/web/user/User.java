package web.user;

public class User {

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
}
