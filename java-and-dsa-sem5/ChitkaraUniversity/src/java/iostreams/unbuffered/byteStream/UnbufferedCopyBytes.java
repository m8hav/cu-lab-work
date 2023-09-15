package java.iostreams.unbuffered.byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UnbufferedCopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("IOFiles/unbufferedCopyBytesInput.CreatePath");    // source file
            out = new FileOutputStream("IOFiles/unbufferedCopyBytesOutput.CreatePath");

            System.out.println("Total bytes available: " + in.available());

            int c;
//            bytes of input are read from source and stored as integer in c
//            then bytes are written to destination file by converting them from integer to byte again
            while ((c = in.read()) != -1) {
//                -1 basically means end of file, like EOF in C
                System.out.println(c);
                out.write(c);
            }

            System.out.println("The process is completed.");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, the source file is not found!");
            //            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
//            output might not save without closing the streams
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }
}
