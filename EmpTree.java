import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class EmpTree {
    public static void main(String[] args) {

        TreeMap<Integer, String> empMap = new TreeMap<>();

           Scanner scanner = new Scanner(System.in);

           // Prompt the user to enter the number of employees
           System.out.print("enter the total number of employees-> ");
           int numEmployees = scanner.nextInt();
           

           for (int i = 0; i < numEmployees; i++) {
               System.out.print("enter the employee ID-> ");
               int empId = scanner.nextInt();
               scanner.nextLine();
               System.out.print("enter the employee name-> ");
               String empName = scanner.nextLine();
               
               // Add the employee ID and name to the TreeMap
               empMap.put(empId, empName);
           }
           
          
           // Sorting in alphabetical order
           
           List<String> sortednames = new ArrayList<>(empMap.values());
           Collections.sort(sortednames);
           
           System.out.println("");
           System.out.println("employee name in alphabetical order");
           
           for (String name : sortednames) {
               System.out.println(name);
           }
           
           }  
}


/*
 Output
enter the total number of employees-> 5
enter the employee ID-> 1
enter the employee name-> Boopathi
enter the employee ID-> 2
enter the employee name-> Rajkumar
enter the employee ID-> 3
enter the employee name-> Manoj
enter the employee ID-> 4
enter the employee name-> Arun
enter the employee ID-> 5
enter the employee name-> Dharanesh

employee name in alphabetical order
Arun
Boopathi
Dharanesh
Manoj
Rajkumar
 */