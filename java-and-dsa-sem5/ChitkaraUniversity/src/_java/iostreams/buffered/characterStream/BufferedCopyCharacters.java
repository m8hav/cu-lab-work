package _java.iostreams.buffered.characterStream;

import java.io.*;

public class BufferedCopyCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader bReader = null;
        BufferedWriter bWriter = null;

        try {
            bReader = new BufferedReader(new FileReader("IOFiles/bufferedCopyCharactersInput.CreatePath"));
            bWriter = new BufferedWriter(new FileWriter("IOFiles/bufferedCopyCharactersOutput.CreatePath"));

            String line;
            while ((line = bReader.readLine()) != null) {
                System.out.println(line);
                bWriter.write(line);
            }

            System.out.println("Process completed successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            //            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Some other exception ");
            throw new RuntimeException(e);
        } finally {
//            output won't be saved without closing the streams
            if (bReader != null) bReader.close();
            if (bWriter != null) bWriter.close();
        }
    }
}
