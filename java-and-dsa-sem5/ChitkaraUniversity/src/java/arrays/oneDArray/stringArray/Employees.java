package java.arrays.oneDArray.stringArray;

import java.util.Arrays;
import java.util.Scanner;

public class Employees {
    public Employees() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int numberOfEmployees = Integer.parseInt(scanner.nextLine().trim());

        String[] employeeInfo = {"ID", "Name", "Designation", "Company"};
        String[] employeeDetails = new String[employeeInfo.length];

        String[] employeeCompleteDetails = new String[employeeInfo.length];
        String[] employees = new String[numberOfEmployees];

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nEnter details of the next employee:");
            for (int j = 0; j < employeeInfo.length; j++) {
                System.out.print(employeeInfo[j] + ": ");
                employeeDetails[j] = scanner.nextLine().trim();

                employeeCompleteDetails[j] = employeeInfo[j] + ": " + employeeDetails[j];
            }
//            System.out.println(employeeCompleteDetails);              // [Ljava.lang.String;@6d6f6e28
//            employees[i] = employeeCompleteDetails.toString();        // [Ljava.lang.String;@6d6f6e28
//            both above give us addresses
            employees[i] = Arrays.toString(employeeCompleteDetails);
            System.out.println(employees[i]);
        }
        System.out.println();

        System.out.println(employees);
        System.out.println(Arrays.toString(employees));
        System.out.println();

        for (String employee : employees)
            System.out.println(employee);

    }
}
