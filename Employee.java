
package com.example.hr;
public class Employee {
    String name;
		     int id;
		     double salary;
		     
		     public static void main(String[] args) {
		     }
		    
		    	 
		    // Constructor
		    public Employee(String name, int id, double salary) {
		        this.name = name;
		        this.id = id;
		        this.salary = salary;
		    }
		    
		   
		    public void printName() {
		    	
		        System.out.println("Employee name-> " +name);
		    }
		    
		    public void printSalary() {

		    	System.out.println("Employee salary-> " +salary);
		    
			
	}
}
