package java.exceptionHandling.custom;

public class CustomException extends Exception {
    private String message;

    public CustomException(String message) {
        super("message to super - " + message);
//        just ^ or creating custom private message and setting that with constructor and overriding the toString method.
        this.message = "custom message - " + message;
    }

    @Override
    public String toString() {
        return message;
    }

    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception.");
        } catch (CustomException ce) {
            System.out.println(ce);
//            ^ returns message from overridden toString()
//            ^ if toString() not overridden, it returns the entire class package hierarchy and then the message
            System.out.println(ce.getMessage());
//            ^ returns the detailMessage string from Throwable class i.e. message sent to super() in Throwable
        }
    }
}
