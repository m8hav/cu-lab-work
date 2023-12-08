package dsa.stringAlgorithms.searchPatternWithinString;

// ROLLING HASH CONCEPT

public class RabinKarpAlgorithm {

    // number of characters in 8-bit ASCII
    static final int NUMBER_OF_CHARACTERS = 256;

    public static void matchPatternWithRabinKarp(String str, String pat, int prime) {
        int slen = str.length();
        int plen = pat.length();

        // hash values for both
        int sHV = 0;
        int pHV = 0;

        int i, j;

        // STEP 1
        int HV = (int) (Math.pow(NUMBER_OF_CHARACTERS, plen - 1) % prime);
    }

    public static void main(String[] args) {
        String str = "ABABCABACCAABACABA";
        String pat = "CAB";

        RabinKarpAlgorithm obj = new RabinKarpAlgorithm();

//        obj.matchPatternWithRabinKarp(str, pat);
    }
}
