package annotations.custom.fieldLevel;

import java.lang.reflect.Field;

public class FieldLevelMain {
    public void runProgram() throws IllegalAccessException {
        String candidateName = "Harry Potter";
        int candidateAge = 21;

        ElectionCandidate obj = new ElectionCandidate(candidateName, candidateAge);

        for (Field field : obj.getClass().getDeclaredFields()) {
            System.out.println(">>> " + field);

            if (field.isAnnotationPresent(CandidateName.class)) {
                Object objData = field.get(obj);

//                check and typecast to string : in JRE 16
                if (objData instanceof String) {
                    System.out.println(String.valueOf(objData).toUpperCase());
                }
            }
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        FieldLevelMain obj = new FieldLevelMain();
        obj.runProgram();
    }
}
