package com.tns.ifet.exercise1;

import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter Employee Details:");
            System.out.print("ID: ");
            int id = scanner.nextInt();//input for str
            scanner.nextLine(); // Consume newline

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();//input for double 
            scanner.nextLine(); // Consume newline

            System.out.print("Is the employee a manager? (yes/no): ");
            String isManager = scanner.nextLine();

            if (isManager.equalsIgnoreCase("yes")) {
                System.out.print("Department: ");
                String department = scanner.nextLine();

                // Create Manager Object
                Manager manager = new Manager(id, name, salary, department);
                System.out.println("\nManager Details:");
                System.out.println(manager);
            } else {
                // Create Employee Object
                Employee employee = new Employee(id, name, salary);
                System.out.println("\nEmployee Details:");
                System.out.println(employee);
            }

        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
