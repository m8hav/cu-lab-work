package iostreams.file;

import java.io.File;
import java.util.Scanner;

public class CreateDirectory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Path: ");
        String path = input.nextLine();
//        C:/Users/BartBruh/Documents/GitHub/cu-lab-work/java-programming-sem5/ChitkaraUniversity/IOFiles


        do {
            System.out.print("New Directory Name: ");
            String newDirectoryName = input.nextLine();
//            personal
//            documents/hierarchy

            path = path + "/" + newDirectoryName;

            File file = new File(path);

            boolean isCreated = file.mkdir();
//            boolean isCreated = file.mkdirs();

            if (isCreated) System.out.println("A new directory is created successfully");
            else System.out.println("Oops! There is some error in creation of a new directory");

            System.out.print("Do you want to add another directory? (Y/N)");
            String option = input.nextLine();

            if (!option.equalsIgnoreCase("Y")) {
                break;
            }

        } while (true);
    }
}
