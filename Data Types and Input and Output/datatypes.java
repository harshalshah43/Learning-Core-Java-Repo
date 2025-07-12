import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class datatypes{
    public static void main(String args[]){
        byte byteVal; //primitives 1 byte 8 bits  
        int intVal;   // 4 bytes
        float floatVal; // 8 bytes
        double doubleVal;
        long longVal;
        boolean boolVal; // 1 bit
        char charVal;  // 1 byte
        
        String strVal; //non primitive or derived datatypes
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter int");
        intVal = sc.nextInt();

        System.out.println("Enter float");
        floatVal = sc.nextFloat();

        System.out.println("Enter double");
        doubleVal = sc.nextDouble();

        System.out.println("Enter long");
        longVal =sc.nextLong();

        System.out.println("Enter bool");
        boolVal = sc.nextBoolean();

        
        System.out.println("Enter char");
        sc.nextLine();
        charVal = sc.nextLine().charAt(0);
        
        System.out.println("Enter byte");
        byteVal = sc.nextByte();

        System.out.println("Enter String");
        sc.nextLine();
        strVal = sc.nextLine();


        System.out.println("\n--- Values from Scanner ---");
        System.out.println("int: " + intVal);
        System.out.println("float: " + floatVal);
        System.out.println("double: " + doubleVal);
        System.out.println("byte: " + byteVal);
        System.out.println("long: " + longVal);
        System.out.println("boolean: " + boolVal);
        System.out.println("char: " + charVal);
        System.out.println("string: " + strVal);

        InputStreamReader inputstreamreader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputstreamreader);

        System.out.println("Buffered Reader Prepared. You can start entering your inputs");
        
        System.out.println("Enter Integer");
        
        try{
        int intVal2 = Integer.parseInt(reader.readLine());
        
        System.out.println("Enter Float");
        float floatVal2 = Float.parseFloat(reader.readLine());
        
        // Double

        // Long 

        // Bool

        // Byte 
        
        }
        catch (Exception e){e.printStackTrace();}
    }
}