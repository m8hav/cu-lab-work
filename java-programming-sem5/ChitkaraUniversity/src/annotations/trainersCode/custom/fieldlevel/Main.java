package annotations.trainersCode.custom.fieldlevel;

import java.lang.reflect.Field;

public class Main {

	public Main() {
	}

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		String candidateName = "Harry Potter";
		int candidateAge = 21;
		
		ElectionCandidate obj = new ElectionCandidate(candidateName, candidateAge);
		
		for(Field field: obj.getClass().getDeclaredFields()) {
			//System.out.println(">>> " + field);
	
			if(field.isAnnotationPresent(CandidateName.class)){
				//System.out.println(field.get(obj));
				
				Object objData = field.get(obj);
				
				//check and typecast to string : in JRE 16
//				if(objData instanceof String stringData) {
//					System.out.println(stringData.toUpperCase());
//				}
			}
		
		}
		
	}

}
