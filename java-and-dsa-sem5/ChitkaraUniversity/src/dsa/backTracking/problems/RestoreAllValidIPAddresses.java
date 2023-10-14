package dsa.backTracking.problems;

import java.util.ArrayList;
import java.util.List;

public class RestoreAllValidIPAddresses {
    private static int addressCount;

    private static boolean isPartValid(String part) {
        /*
            CHECKS TO EXIT:
            1. if the length of the part is of 0 character
            2. If the length of the part is greater than 3 characters
            (no need to check first 2 conditions because part length is already between 1 and 3 from the code making the parts)
            3. If the first leading character of the part is 0 and the part consists of 2 or 3 characters
            4. If the part value is greater than 255.
         */

        if ((part.charAt(0) == '0' && part.length() > 1) || Integer.parseInt(part) > 255)
            return false;
        return true;
    }

    private static void _printAllValidIPAddresses(String addressString, List<String> currentIPList, int currentIndex, int partNumber) {
        if (currentIndex == addressString.length() && currentIPList.size() == 4) {
            System.out.println(++addressCount + ": " + String.join(".", currentIPList));
            return;
        }

        if (currentIPList.size() == 4)
            return;


        // recursive calls
        for (int i = 1; i <= 3 && currentIndex + i <= addressString.length(); i++) {
            String part = addressString.substring(currentIndex, currentIndex + i);
            if (isPartValid(part)) {
                currentIPList.add(part);
                _printAllValidIPAddresses(addressString, currentIPList, currentIndex + i, partNumber + 1);
                currentIPList.remove(currentIPList.size() - 1);
            }
        }
    }

    public static void printAllValidIPAddresses(String addressString) {
        System.out.println("All IP addresses with address string " + addressString + ": ");
        addressCount = 0;
        List<String> currentIPList = new ArrayList<>();
        if (addressString.length() >= 4 && addressString.length() <= 12)
            _printAllValidIPAddresses(addressString, currentIPList, 0, 1);
        System.out.println(addressCount + " total addresses");
    }


    public static void main(String[] args) {
        String validIP = "25525511135";
        String invalidIP1 = "25505011535";
        String invalidIP2 = "101023";

        printAllValidIPAddresses(validIP);
        System.out.println();

        printAllValidIPAddresses(invalidIP1);
        System.out.println();

        printAllValidIPAddresses(invalidIP2);
        System.out.println();
    }
}
