import java.util.*;

public class list2
{
    public static void main(String args[])
    {
        List<List<String>> departments = new ArrayList<>();
        
        departments.add(Arrays.asList("Ram","Sam"));
        departments.add(Arrays.asList("Jenny","Charlie","Tom"));
        departments.add(Arrays.asList("Santosh","Sunny","Krish"));


        for(List<String> dept:departments)
            {
                for(String employee_name:dept)
                    System.out.print(employee_name + " ");
                System.out.println();
            }

    }       
}

//H.W:
// Create a 2D list called Category, each Category will contain List of Products
// Add items from the list and print them using nested forloop


// departments
// 0     [<name`><name2>.....] List of Strings
// 1     [<name`><name2>.....] List of Strings