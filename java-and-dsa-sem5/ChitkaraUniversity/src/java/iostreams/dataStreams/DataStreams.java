package java.iostreams.dataStreams;

import java.io.*;

public class DataStreams {
    static final String dataFileName = "IOFiles/DataStreams.CreatePath";

    static final double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
    static final int[] units = {12, 8, 13, 29, 50};
    static final String[] descs = {
            "Java T-shirt",
            "Java Mug",
            "Duke Juggling Dolls",
            "Java Pin",
            "Java Key Chain"
    };

    public static void main(String[] args) throws IOException {
        DataOutputStream out = null;
        DataInputStream in = null;

//        WRITING TO FILE FIRST
        try {
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFileName)));
            for (int i = 0; i < prices.length; i++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
            out.close();
            System.out.println("\n=====Data written successfully=====\n");
        } catch (IOException e) {
            System.out.println("Error occurred while writing: " + e);
//            throw new RuntimeException(e);
        }

//        READING DATA STREAM FROM FILE NOW
        try {
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFileName)));
            double price;
            int unit;
            String desc;
            double total = 0.0;
            while (in.available() > 0) {
                price = in.readDouble();
                unit = in.readInt();
                desc = in.readUTF();
                System.out.format("You ordered %d units of %s at $%.2f%n",
                        unit, desc, price);
                total += unit * price;
                System.out.println("Estimated bytes available: " + in.available());
            }
            System.out.printf("Your total is $%.2f\n", total);
            in.close();
            System.out.println("\n=====Data read successfully=====\n");
        } catch (IOException e) {
            System.out.println("Error occurred while reading: " + e);
            throw new RuntimeException(e);
        }
    }
}
