package _java.exceptionHandling.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionFNFE {
    File file;
    public void openAndReadFile(String filePath, String fileName) {
        file = new File(filePath + "." + fileName);
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Please check the path and the file.");
        }
    }

    public static void main(String[] args) {
        ExceptionFNFE obj = new ExceptionFNFE();
        obj.openAndReadFile("sample_path", "sample_name");
    }
}
