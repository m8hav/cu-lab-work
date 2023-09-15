package java.collections.map.employeeExample;

import java.util.*;

public class EmployeeDetails {

    public static void runSingleEmployeeProgram() {
        Map<String, String> objEmployeeDetailsMap1 = new HashMap<>();
//        This map will only save one value with one key/ID
//        But we need to save multiple values to one ID

        objEmployeeDetailsMap1.put("DEV-101", "RICHARD");

        Map <String, List<String>> objEmployeeDetailsMap2 = new HashMap<>();
        List<String> objEmployeeDetailsList = new ArrayList<>();

//        TO ENTER SINGLE EMPLOYEE'S DETAILS
//        Method 1 - Add List to Map and then add values to the added List
        objEmployeeDetailsMap2.put("00123", objEmployeeDetailsList);

        objEmployeeDetailsMap2.get("00123").add("Tim");
        objEmployeeDetailsMap2.get("00123").add("Project Manager");
        objEmployeeDetailsMap2.get("00123").add("PM");
        objEmployeeDetailsMap2.get("00123").add("$12k");
        objEmployeeDetailsMap2.get("00123").add("8860000XXX");
        objEmployeeDetailsMap2.get("00123").add("tim@gmail.com");

        objEmployeeDetailsList.clear();

//        Method 2 - Add values to List and then add List to Map
        objEmployeeDetailsList.add("Bart");
        objEmployeeDetailsList.add("Tech Lead");
        objEmployeeDetailsList.add("TL");
        objEmployeeDetailsList.add("$20k");
        objEmployeeDetailsList.add("858000XXXX");
        objEmployeeDetailsList.add("bart@gmail.com");

        objEmployeeDetailsMap2.put("00234", objEmployeeDetailsList);
        for (Map.Entry<String, List<String>> entry : objEmployeeDetailsMap2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
//        the inner details get overwritten for first employee too because of shallow copy of the value List

        System.out.println();
    }

    public static void runMultipleEmployeesProgram() {
//        TO ADD MULTIPLE VALUES
        Scanner input = new Scanner(System.in);

        Map <String, List<String>> map = new HashMap<>();
        List <String> list = null;

        String [] employeeDetailNames = new String[] {"Name", "Location", "Designation", "Annual Salary"};
        int totalEmployees;

        System.out.print("Enter number of employees: ");
        try {
            totalEmployees = Integer.parseInt(input.nextLine().trim());
        } catch (Exception e) {
            totalEmployees = 3;
        }
        System.out.println();

        for (int i = 0; i < totalEmployees; i++) {
            list = new ArrayList<>();

            System.out.printf("Enter details for employee %d: \n", i+1);

            System.out.print("Employee ID >>> ");
            map.put(input.nextLine().trim(), list);

            for (String employeeDetailName : employeeDetailNames) {
                System.out.print(employeeDetailName + " >>> ");
                list.add(input.nextLine().trim());
            }

            System.out.println("\nEmployee " + (i+1) + " Added\n\n");
        }

        System.out.println("Printing added employee details:");
        for (String detailName : employeeDetailNames) System.out.print(detailName + " | ");
        System.out.println();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        runSingleEmployeeProgram();
        runMultipleEmployeesProgram();
    }
}
