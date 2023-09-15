package java.iostreams.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatePath {
    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/BartBruh/Documents/GitHub/cu-lab-work/java-programming-sem5/ChitkaraUniversity/IOFiles");

        Path newDirectory = null;
        Path newFile = null;

        try {
            newDirectory = Files.createDirectories(path.getParent().resolve("newDirName/personal"));

//            PENDING CODE YET

        } catch (IOException e) {
            System.out.println("Exception occurred while creating file: " + e);
            e.printStackTrace();
        }
    }
}
