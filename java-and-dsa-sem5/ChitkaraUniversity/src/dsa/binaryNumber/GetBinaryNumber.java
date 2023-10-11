package dsa.binaryNumber;

import java.math.BigInteger;

public class GetBinaryNumber {
    public static BigInteger getBinary(int n) {
        BigInteger res = new BigInteger("0");
        BigInteger mul = new BigInteger("1");
        while (n > 0) {
            res = res.add(mul.multiply(BigInteger.valueOf(n % 2)));
            mul = mul.multiply(BigInteger.valueOf(10));
            n /= 2;
        }
        return res;
    }

    public static String getBinaryString(int n) {
        String res = "";
        while (n > 0) {
            res = (n % 2) + res;
            n /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getBinary(14));
        System.out.println(getBinary(100));
        System.out.println(getBinary(70000000));
        System.out.println();

        System.out.println(getBinaryString(14));
        System.out.println(getBinaryString(100));
        System.out.println(getBinaryString(70000000));
        System.out.println();
    }
}
