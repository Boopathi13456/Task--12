package com.example.hrtest;

import java.util.Scanner;

import com.example.hr.Employee;

public class EmployeeTest {
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the employee name-> ");
		String name = scanner.nextLine();

		System.out.println("enter the employee ID-> ");
		int id = scanner.nextInt();

		System.out.println("enter the employee salary-> ");
		Double salary = scanner.nextDouble();

		// Creates instance of Employee class
		
		Employee emp = new Employee(name, id, salary);
		System.out.println("\n");
		emp.printName();
		emp.printSalary();

	}

}


/*
 Output

enter the employee name-> 
Boopathi
enter the employee ID-> 
10
enter the employee salary-> 
15000


Employee name-> Boopathi
Employee salary-> 15000.0
 */