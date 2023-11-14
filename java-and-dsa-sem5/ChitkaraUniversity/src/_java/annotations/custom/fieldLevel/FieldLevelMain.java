package _java.annotations.custom.fieldLevel;

import _java.annotations.trainersCode.custom.fieldlevel.CandidateName;
import _java.annotations.trainersCode.custom.fieldlevel.ElectionCandidate;

import java.lang.reflect.Field;

public class FieldLevelMain {
    public void runProgram() throws IllegalAccessException {
        String candidateName = "Harry Potter";
        int candidateAge = 21;

        _java.annotations.trainersCode.custom.fieldlevel.ElectionCandidate obj = new ElectionCandidate(candidateName, candidateAge);

        for (Field field : obj.getClass().getDeclaredFields()) {
            System.out.println(">>> " + field);

            if (field.isAnnotationPresent(CandidateName.class)) {
                Object objData = field.get(obj);
//                ^ getting field's value for provided object (obj)
//                then putting that value in object of type Object, so it can hold any member type

//                Check the object type is String and then typecast to String
//                in JRE 16:
//                if (objData instanceof String stringData) {
//                    System.out.println(stringData.toUpperCase());
//                }
//                earlier versions:
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
