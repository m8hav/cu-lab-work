package practice.votingApp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    String name, country;
    int age;

//    Regexes
    String nameRegex = "^[a-z A-Z.]+$";
//    String notNumberRegex = "\\d";
    String onlyNumberRegex = "^[0-9]+$";

//    Patterns
    Pattern namePattern = Pattern.compile(nameRegex);
    Pattern onlyNumberPattern = Pattern.compile(onlyNumberRegex);

//    Matcher
    Matcher m;

    private boolean strHasOnlyAlphabets(String str) {
        return namePattern.matcher(str).matches();
    }

    private boolean strHasOnlyDigits(String str) {
        return onlyNumberPattern.matcher(str).matches();
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public User() {

        System.out.println("Please enter your details to register: ");

//        creating new scanner
        Scanner scanner = new Scanner(System.in);
//        String variable to get input
        String input;
//        boolean to check if input is invalid
        boolean invalidInput;

//        getting details from user repeatedly until they enter them correctly
        do {
            System.out.print("Name: ");
            input = scanner.nextLine().trim();
//            make sure the input is not empty and doesn't have any
//            characters except alphabets and spaces in middle
            invalidInput = input.isEmpty() || ! strHasOnlyAlphabets(input) || input.length() < 3;
            if (invalidInput)
                System.out.println("Invalid name. Please enter only alphabets and spaces and more than 3 characters.");
//            setting value if input is valid
            else name = input;
        } while (invalidInput);

//        repeating process for Age and Country
        do {
            System.out.print("Age: ");
            input = scanner.nextLine().trim();

//            make sure input isn't empty and has only integers between 0 and 120
//            PROBLEM IN REGEX - ASK SIR
            invalidInput = input.isEmpty() || ! strHasOnlyDigits(input)
                    || Integer.parseInt(input) < 0 || Integer.parseInt(input) > 120;
            if (invalidInput)
                System.out.println("Invalid age. Please enter only integers between 0 and 120.");
            else age = Integer.parseInt(input);

//            age = Integer.parseInt(input);
        } while (invalidInput);

        do {
            System.out.print("Country: ");
            input = scanner.nextLine().trim();
            invalidInput = input.isEmpty() || ! strHasOnlyAlphabets(input) || input.length() < 2;
            if (invalidInput)
                System.out.println("Invalid country. Please enter only alphabets.");
            else country = input;
        } while (invalidInput);

        System.out.println("\nUser successfully registered!");
    }
}
