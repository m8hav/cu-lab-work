package iostreams.buffered.byteStream;

import java.io.*;

public class BufferedCopyBytes {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bReader = null;
        BufferedOutputStream bWriter = null;

        try {
            bReader = new BufferedInputStream(new FileInputStream("IOFiles/bufferedCopyBytesInput.CreatePath"));
            bWriter = new BufferedOutputStream(new FileOutputStream("IOFiles/bufferedCopyBytesOutput.CreatePath"));

            int c;
            while ((c = bReader.read()) != -1) {
                System.out.println(c);
                bWriter.write(c);
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
