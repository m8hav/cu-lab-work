package practice.payment_app_system;

public class User {
    static int userCount = 0;
    int userID;
    public User() {
        this.userID = userCount++;
    }
}
