package dsa.stringAlgorithms.searchPatternWithinString;

import java.util.Scanner;


public class ZValueAlgorithmSirsCode {

	private static Scanner input;
	
	private String _string;
	private String _pattern;
	
	
	static {
		input = new Scanner(System.in);		
	}
	
	public ZValueAlgorithmSirsCode(String _string) {
		_string = input.next();
		this._string = _string;
	}

	public String getString() {
		return _string;
	}
	

	public void setPattern(String _pattern) {
		_pattern = input.next();
		this._pattern = _pattern;
	}
	
	public String getPattern() {
		return _pattern;
	}
	
	
	

	
	//LOGIC BUILDING CODE
	public void do_pattern_matching_with_z_algorithm(String _string, String _pattern) {

		//1. Create a new string by concatenating a pattern with string and a special character in-between

		String SC = "#";
		String new_string = _pattern + SC + _string;		//XYXYZ + # + YXYXYZZ
		
		
		//2. Create Z-Array to store the comparing results 
		int new_string_length = new_string.length();
		int Z[] = new int[new_string_length];
		
		createZArray(new_string, Z);
		
				
		//3. Now looping through Z-Array for matching condition (z[i] == pattern_length)
		int pattern_length = _pattern.length();
		
		for(int i = 0; i<new_string_length; i++) {

			if(Z[i] == pattern_length) {
				System.out.println("Pattern FOUND @index: " + (i - pattern_length - 1));
			}
			
		}
		
		
		
	}
	
	
	
	
	
	//LOGIC BUILDING CODE - SUPPORTER  [create a 'zArray' from the new_string]
	public void createZArray(String new_string, int[] Z) {

		int new_string_length = new_string.length();
		
		int LP = 0;
		int RP = 0;
		
		Z[0] = 0;
		
		for(int i = 1; i<new_string_length; i++) {
			
			if(i > RP) {				
				//>>>*Maintain the condition:  1 <= LP <= i <= RP < new_string_length
				
				LP = i;
				RP = i;
					
				while( RP < new_string_length && new_string.charAt(RP)  ==  new_string.charAt( RP - LP ) ) {
					RP++;
				}
				
				Z[i] = RP - LP;	
				
				RP--;
				
				
			}else {	//(i <= RP)
			
					int index = i - LP;	
					
					if(Z[index] < (RP - i + 1) ) {
						
						Z[i] = Z[index];
 						
					}else {
						
						LP = i;
						
						while( RP < new_string_length && new_string.charAt(RP)  ==  new_string.charAt( RP - LP ) ) {
							RP++;
						}
										
						Z[i] = RP - LP;	
						
						RP--;
						
					
					}				
				
				}
				
				
			}
		
		
		
	}
	
	
	
	
	
	
	
	

	//DRIVER CODE
	public static void main(String[] args) {

		
		String _string = null;
		String _pattern = null;
		
		ZValueAlgorithmSirsCode obj = new ZValueAlgorithmSirsCode(_string);
		
		obj.setPattern(_pattern);
		
		
		obj.do_pattern_matching_with_z_algorithm(obj.getString(), obj.getPattern());
		
	}


}


/*

YXYXYZZ
XYXYZ

Pattern FOUND @index: 1




YXYXYZZXYXYZ
XYXY

Pattern FOUND @index: 1
Pattern FOUND @index: 7



YXYXYZZXYXYZ
YXY
Pattern FOUND @index: 0
Pattern FOUND @index: 2
Pattern FOUND @index: 8


*/
