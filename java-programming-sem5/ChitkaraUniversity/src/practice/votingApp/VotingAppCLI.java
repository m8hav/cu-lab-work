package practice.votingApp;

import java.util.Scanner;

public class VotingAppCLI {
    VotingServer votingServer = new VotingServer();
    public void runCLIApp() {

        Scanner scanner = new Scanner(System.in);
        String input;
        int option;

        System.out.println("Welcome to the Voting App System!");
        while (true) {
            System.out.println("\nPlease enter a number from 1 to 3 for the following commands:");
            System.out.println("1 - Register User");
            System.out.println("2 - Cast Vote");
            System.out.println("3 - Exit program");
            System.out.print(">>> ");
            input = scanner.nextLine().trim();
            System.out.println();
            if (input.matches("\\D") || Integer.parseInt(input) < 1 || Integer.parseInt(input) > 3) {
                System.out.println("Please enter only integers between 1 and 3");
                continue;
            }
            option = Integer.parseInt(input);
            if (option == 1) {
                if (votingServer.getUser() != null) {
                    System.out.println("User already registered!");
                    continue;
                }
                votingServer.setUser(new User());
            } else if (option == 2) {
                if (votingServer.getUser() == null) {
                    System.out.println("You need to register a user first!");
                    continue;
                }
                votingServer.castVote();
            } else break;
        }
    }
}
