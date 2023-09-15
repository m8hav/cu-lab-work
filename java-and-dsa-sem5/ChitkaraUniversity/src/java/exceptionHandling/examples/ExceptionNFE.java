package java.exceptionHandling.examples;

import java.util.Scanner;

public class ExceptionNFE {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ExceptionNFE obj = new ExceptionNFE();

        System.out.print("Please Enter Your Name: ");
        String sName = input.nextLine().trim();
        obj.setName(sName);

        System.out.print("Please Enter Your Age (in numbers): ");
        String sAge = input.nextLine().trim();

        try {
            int age = Integer.parseInt(sAge);
            obj.setAge(age);
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            System.out.println("Please provide a valid number input");
        } finally {
            System.out.println(obj.getName());
            System.out.println(obj.getAge());
        }
    }
}
