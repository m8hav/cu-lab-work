package practice.rocketLauncher;

import java.util.Scanner;

public class Checker {
    boolean working = false;
    public void setWorking(){
        Scanner scanner = new Scanner(System.in);
        working = Boolean.parseBoolean(scanner.nextLine().trim());
    }
    public boolean getWorking() {
        return working;
    }
}
