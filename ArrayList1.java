
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Declaring an Array list of type string
		ArrayList<String> AL = new ArrayList<>();

		System.out.println("Enter the name followed by space ");
		String name = sc.nextLine();

		// Using split method to split each names
		String[] nameArray = name.split(" ");
		
		for (int i = 0; i < nameArray.length; i++) {
			AL.add(nameArray[i]);
		}
		System.out.println("\n");
		System.out.println("Elements in ArrayList");
		System.out.println(AL+" ");
		
		// Remove all elements in the array list
		AL.removeAll(AL);
		System.out.println("\n");
		System.out.println("Removing elements from an ArrayList");
		System.out.println(AL + " ");

	} 
}


/*
 Output
Enter the name followed by space 
Boopathi T


Elements in ArrayList
[Boopathi, T]


Removing elements from an ArrayList
[]
 */