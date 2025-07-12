//introduction
import java.util.*;

class arrays1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number of Elements");
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0;i < n; i++)
        {
            a[i] = sc.nextInt();
        }    
        
        System.out.println("--------");

        for(int i = 0;i <= n -1; i++)  
        {
            System.out.println(a[i]);
        }    

        System.out.println("Lets work with char array, Enter the value of n");

        n = sc.nextInt();
        sc.nextLine();
        char c[] = new char[n];
        c = sc.nextLine().toCharArray();

        System.out.println(c);

        for(int i = 0;i <= n - 1; i++)  
        {
            System.out.println(c[i]);
        } 
        
    }
}

//Assignment

// Repeat the int logic for float, double, bool values