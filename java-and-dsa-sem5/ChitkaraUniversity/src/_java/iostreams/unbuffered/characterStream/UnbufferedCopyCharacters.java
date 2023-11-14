package _java.iostreams.unbuffered.characterStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UnbufferedCopyCharacters {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("IOFILES/unbufferedCopyCharactersInput.CreatePath");
            out = new FileWriter("IOFILES/unbufferedCopyCharactersOutput.CreatePath");

            int c;
//            System.out.println(c = 19);
            while ((c = in.read()) != -1) {
//                System.out.println(c);
                out.write(c);
            }

            System.out.println("The process is completed.");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, the source file is not found!");
//            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Some exception occurred");
            throw new RuntimeException(e);
        } finally {
//            output won't be saved without closing the streams
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }
}
