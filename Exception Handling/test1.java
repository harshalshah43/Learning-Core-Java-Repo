// import java.io.*;
import java.util.*;
class test1
{
    public static void main(String[] args)
    {   // variable declaration
        int numerator,denominator,res;
        String str;
        
        //Input Output
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        
        // str = br.readLine(); // Accept input and store in temp String variable
        // numerator = Integer.parseInt(str); // Convert data in temp variable to int

        // str = br.readLine(); // Accept input and store in temp String variable
        // denominator = Integer.parseInt(str); // Convert data in temp variable to int
        try{
        numerator = sc.nextInt();
        denominator = sc.nextInt();
        
        res = numerator/denominator;
        System.out.println("The Quotient=" + res);
        }
        catch(ArithmeticException ae)
        {
        System.out.println("Cannot divide by zero" + ae);
        }
        catch(NumberFormatException | InputMismatchException e)
        {
        System.out.println("Expecting Valid Numbers only " + e);
        }
        catch(Exception e)
        {
            System.out.println("Unknown Exception caught " + e);
        }
        //Logic
        System.out.println("Thank you for using the program");

    }
}