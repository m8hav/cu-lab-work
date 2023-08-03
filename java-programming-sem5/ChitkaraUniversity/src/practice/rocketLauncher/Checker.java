package practice.rocketLauncher;

import java.util.Scanner;

public class Checker {
    boolean working = false;
    String checkType;
    public void setWorking(){
        System.out.printf("%s Check? (yes/no) - ", checkType);
        Scanner scanner = new Scanner(System.in);
        working = scanner.nextLine().trim().equalsIgnoreCase("yes");
    }
    public boolean checkWorking() {
        return working;
    }
    public Checker(String checkerType) {
        checkType = checkerType;
    }
}
