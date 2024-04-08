import java.util.ArrayList;
import java.util.List;

public class ArrayConversion {
    public static void main(String[] args) {
		
        // Create a List
        List<String> name = new ArrayList<>();
        
        name.add("Boopathi");
        name.add("T");
        name.add("Yellow");
        
        System.out.println("Before Conversion");
        System.out.println(name);

        // Convert List to Array
        String[] nameArray = name.toArray(new String[name.size()]);

        System.out.println("\n");
        System.out.println("After Conversion");
        // Print the Array
        for (String name1 : nameArray) {
            
            System.out.println(name1);
        }
    }
}

/*
 Output
Before Conversion
[Boopathi, T, Yellow]


After Conversion
Boopathi
T
Yellow
 */