package dsa.stringAlgorithms.searchPatternWithinString;

import java.util.Scanner;


public class RabinKarpAlgorithmSirsCode {

	private static Scanner input;

	//number of characters in the input alphabet
	public final static int NUMBER_OF_CHARACTERS = 256;

	private String _string;
	private String _pattern;
	
	

	static {
		input = new Scanner(System.in);		
	}
	
	
	public RabinKarpAlgorithmSirsCode(String _string) {
		_string = input.nextLine();
		this._string = _string;
	}

	public String getString() {
		return _string;
	}


	public void setPattern(String _pattern) {
		_pattern = input.nextLine();
		this._pattern = _pattern;
	}
	public String getPattern() {
		return _pattern;
	}
	
	
	private void getLine() {
		System.out.println("\n");
	}


	//LOGIC BUILDING CODE
    public void do_pattern_matching_with_rabinkarp_algorithm(String _string, String _pattern, int q) {
        
    	int string_length = _string.length();
        int pattern_length = _pattern.length();
                
        int sHV = 0;
        int pHV = 0;

        int i, j;

        
        //STEP:1
        int HV = 1;        
    	HV = (int) (Math.pow(NUMBER_OF_CHARACTERS, pattern_length-1) % q);			
        
        
        //STEP:2
        //Calculate the hash-value for each character in pattern and string (first window of text)
        /*
         * h(p) = [CAB]
         * h(s) = [ABC]ABAABCABAAC
         * 
         */
        for (i = 0; i < pattern_length; i++) {
        	pHV = (NUMBER_OF_CHARACTERS * pHV + _pattern.charAt(i)) % q;
        	sHV = (NUMBER_OF_CHARACTERS * sHV + _string.charAt(i)) % q;
        }
        
        

        //STEP:3
        //Find the match... Slide the [PATTERN] over [STRING]
    	//If pHV == sHV, check their characters one by one
        /*
         * 
         * i : for Slider
         * j : for Characters 
         * 
         * 
         * [CAB]
         * 
         * i
         * [ABC]ABAABCABAAC 	:MATCH BUT NOT EQUAL 
         *  j
         *  
         * A[BCA]BAABCABAAC		:MATCH BUT NOT EQUAL
         * AB[CAB]AABCABAAC		:>> MATCH AND EQUAL
         * ABC[ABA]ABCABAAC		:NOT MATCHED!
         * ABCA[BAA]BCABAAC		:MATCH BUT NOT EQUAL
         * ABCAB[AAB]CABAAC		:MATCH BUT NOT EQUAL
         * ABCABA[ABC]ABAAC		:MATCH BUT NOT EQUAL
         * ABCABAA[BCA]BAAC		:MATCH BUT NOT EQUAL
         * ABCABAAB[CAB]AAC		:>> MATCH AND EQUAL
         * ABCABAABC[ABA]AC		:NOT MATCHED!
         * ABCABAABCA[BAA]C		:NOT MATCHED!
         * ABCABAABCAB[AAC]		:NOT MATCHED!
         *  
         */
        
        for (i = 0; i <= (string_length - pattern_length); i++) {
        	
        	//if the hash-values of both the pattern and the part of the string is same, the only 
        	if (pHV == sHV) {
                
        		//check for individual characters one by one
        		for (j = 0; j < pattern_length; j++) {
        			//if any character in that current sliding window is not matched then break out of the loop
        			if (_string.charAt(i + j) != _pattern.charAt(j)) {
        				break;
        			}
        		}
        		
        		//if all characters matched in that window, than the pattern exists
        		if (j == pattern_length) {
        			System.out.println("Pattern is found at position: " + (i));
        		}
        		
        	}

          
          
        	// To re-calculate the hash value of the characters in the sliding window over the string - Remove leading digit and adding trailing digit
        	if (i < string_length - pattern_length) {

        		sHV = (
        				(NUMBER_OF_CHARACTERS * (sHV - _string.charAt(i) * HV)) + 
        				_string.charAt(i + pattern_length) 
        			  ) % q;
        		
        		
        		// We might get negative value of sHV, converting it to positive
        		if (sHV < 0)
        			sHV = (sHV + q);
        		
        	}
        
        
        }
    
        
        
        
    }
	

    
    //DRIVER CODE
	public static void main(String[] args) {
		
		String _string = null;
		String _pattern = null;
		
		RabinKarpAlgorithmSirsCode obj = new RabinKarpAlgorithmSirsCode(_string);
		
		obj.setPattern(_pattern);		
		
		int q = 11;	//prime number
		obj.do_pattern_matching_with_rabinkarp_algorithm(obj.getString(), obj.getPattern(), q);
		
	}


}


/*

ABCABAABCABAAC
CAB

Pattern is found at position: 2
Pattern is found at position: 8


 */


/*
 * 5 (lines)
 *
 * ABA (pattern)
 * 
 * 
 * ABCABAABCABAAC
 * ABCABAABCABAAC
 * ABCABAABCABAAC
 * ABCABAABCABAAC
 * ABCABAABCABAAC
 * 
 * 
 * FOUND: 3 (times) || NOT FOUND: 0 (times)
 * 
 * 
 * 
 */



