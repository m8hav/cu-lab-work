package dsa.stringAlgorithms.searchPatternWithinString;

import java.util.Scanner;

public class KMPAlgorithmSirsCode {

    private static Scanner input;

    private String _string;
    private String _pattern;


    static {
        input = new Scanner(System.in);
    }

    //CONSTRUCTOR
    public KMPAlgorithmSirsCode(String _string) {
        _string = input.next();
        this._string = _string;
    }

    public String getString() {
        return _string;
    }

    //SETTER & GETTER - PATTERN
    public void setPattern() {
        _pattern = input.next();
    }

    public String getPattern() {
        return _pattern;
    }


    //LOGIC BUILDING CODE - KMP
    public void do_pattern_matching_with_kmp_algorithm(String _string, String _pattern) {

        int[] pi = pi_table(_pattern);        //LPS: [][][][][]


        int string_length = _string.length();
        int pattern_length = _pattern.length();


        //pi_table
        for (int value : pi) {
            System.out.print(value + " ");
        }
        System.out.println();


        int i = 0;
        int j = 0;


        /*
                                (MATCHED)	  (NOT-MATCHED)
                                          i
            FDSFNSDLNGVLKDSGJS L D K J G NDSHG L D K X G KSADJGLAJPD

                               L D K J G
                                       j

                               18
         */

        while (i < string_length) {
            //KEEP CPMPARING AND INCREMENTING BOTH THE POINTERS
            if (_pattern.charAt(j) == _string.charAt(i)) {
                i++;
                j++;
            }

            //IF FOUND THE MATCH, GIVE THE RESULT AND RE-SET THE POINTER 'j' W.R.T. LPS TABLE[j-1] TO COMPARE FURTHER
            //ELSE IF NOT FOUND, RE-SET THE POINTER 'j' W.R.T. LPS TABLE[j-1] IF j>0 or j!=0 TO COMPARE
            if (j == pattern_length) {

                System.out.println("The pattern found @index: " + (i - j));
                j = pi[j - 1];

            } else if (i < string_length && _pattern.charAt(j) != _string.charAt(i)) {

                if (j != 0) {
                    j = pi[j - 1];
                } else {
                    i++; //or JUST START COMPARING WITH THE NEXT POINTER 'i'
                }

            }
        }


    }


    //LOGIC BUILDING CODE - SUPPORTER
    private int[] pi_table(String _pattern) {

        int pattern_length = _pattern.length();

        int[] pi = new int[pattern_length];            //LPS

        pi[0] = 0; //set '0' as default to index [0]

        int i = 1;
        int j = 0;

        /* COMPARE j=0 w.r.t. i=1
         * 			   i
         *   		j
         *
         * 			0  1  2  3
         * PATTERN: A  B  C  A
         *
         * PI[]: 	0  0  0  1		//LPS
         */

        while (i < pattern_length) {
            if (_pattern.charAt(i) == _pattern.charAt(j)) {
                j++;
                pi[i] = j;
                i++;
            } else {
                if (j != 0) {        //or j>0
                    j = pi[j - 1];    //CHECKING THE PI TABLE TO FIND THE LPS AND START COMPARING AGAIN
                } else {
                    pi[i] = j;
                    i++;
                }
            }
        }

        return pi;

    }


    //DRIVER CODE
    public static void main(String[] args) {

        String _string = "";            //ABAABCABAABCABAABCBBAC - ABC

        KMPAlgorithmSirsCode obj = new KMPAlgorithmSirsCode(_string);

        obj.setPattern();

        obj.do_pattern_matching_with_kmp_algorithm(obj.getString(), obj.getPattern());

    }

}


// FDSFNSDLNGVLKDSGJSLDKJGNDSHGLDKXGKSADLDKJGJGLAJPD - LDKJG - 0 0 0 0 0 

// ABABSHCBABAABACDNCBBABAABACNDFSIDSABAA - AABAC - 0 1 0 1 0 


/*

UNDERSTAND THE PI TABLE: 

abbabcbcabcbd - abcbd
a b c b d
0 0 0 0 0 



ABCDEF
A B C D E F
0 0 0 0 0 0 


ABCA
A B C A
0 0 0 1 


ABAABDAAB
A B A A B D A A B
0 0 1 1 2 0 1 1 2 


ABAACABAAD
A B A A C A B A A D
0 0 1 1 0 1 2 3 4 0 


HELLO
H E L L O
0 0 0 0 0 


NITIN
N I T I N
0 0 0 0 1 


INDIA
I N D I A
0 0 0 1 0 


$&^#@%
$ & ^ # @ % 
0 0 0 0 0 0 


^&^@##*@#
^ & ^ @ # # * @ #
0 0 1 0 0 0 0 0 0 


#$@%#$##%#$#
# $ @ % # $ # # % # $ #
0 0 0 0 1 2 1 1 0 1 2 1 


ABABAABA
A B A B A A B A
0 0 1 2 3 1 2 3 


ABCDABEABF
A B C D A B E A B F
0 0 0 0 1 2 0 1 2 0 


ABCDEABFABC
A B C D E A B F A B C
0 0 0 0 0 1 2 0 1 2 3 


AABCADAABE
A A B C A D A A B E
0 1 0 0 1 0 1 2 3 0 




*/