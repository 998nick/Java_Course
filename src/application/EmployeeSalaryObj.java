package application;

import entities.EmployeeSalary;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeSalaryObj {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        EmployeeSalary employee = new EmployeeSalary();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();


        System.out.println("Employee " + employee);

        System.out.print("Which porcentage to increase salary? ");

        double porcentage = sc.nextDouble();
        employee.increaseSalary(porcentage);

        System.out.println("Update data: " + employee);


        sc.close();


    }
}
