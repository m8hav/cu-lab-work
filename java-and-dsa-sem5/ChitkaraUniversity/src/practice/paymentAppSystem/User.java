package practice.paymentAppSystem;

public class User {
    static int userCount = 0;
    int userID;
    String userFirstName, userLastName;

    public User(String firstName, String lastName) {
        this.userID = userCount++;
        userFirstName = firstName;
        userLastName = lastName;
    }

    String getFirstName() {
        return userFirstName;
    }

    String getLastName() {
        return userLastName;
    }

    String getFullName() {
        return userFirstName + " " + userLastName;
    }
}
