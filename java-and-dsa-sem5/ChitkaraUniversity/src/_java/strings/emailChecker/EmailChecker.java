package _java.strings.emailChecker;

public class EmailChecker {
    public boolean checkEmail(String email) {
        if (email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"))
            return true;
        else return false;
    }
}
