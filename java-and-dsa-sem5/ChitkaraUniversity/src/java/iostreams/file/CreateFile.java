package java.iostreams.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String path = "C:/Users/BartBruh/Documents/GitHub/cu-lab-work/java-programming-sem5/ChitkaraUniversity/IOFiles";
        System.out.println("Path: " + path);

        System.out.print("File: ");
        String fileName = input.nextLine();

        File file = new File(path + "/" + fileName);
//        emp_data.txt
        System.out.println("File instance created: " + file);

        boolean result;

        try {
            result = file.createNewFile();

            File resultFile = file.getCanonicalFile();

//            if (result) System.out.println("File created: " + file.getCanonicalFile());
//            else System.out.println("File already exists at location: " + file.getCanonicalFile());

            if (result) System.out.println("File created: " + file.getCanonicalPath());
            else System.out.println("File already exists at location: " + file.getCanonicalPath());

            resultFile = file.getAbsoluteFile();

//            if (result) System.out.println("File created: " + file.getAbsoluteFile());
//            else System.out.println("File already exists at location: " + file.getAbsoluteFile());

            if (result) System.out.println("File created: " + file.getAbsolutePath());
            else System.out.println("File already exists at location: " + file.getAbsolutePath());

        } catch (IOException e) {
//            exception occurs if there is some problem with file creation, like providing path with folders that don't exist
            System.out.println("Exception occurred while creating file: " + e);
            e.printStackTrace();
            System.out.println("bruh");
//            throw new RuntimeException(e);
        }
    }
}
