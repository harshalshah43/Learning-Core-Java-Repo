import java.io.*;

class Month
{
public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    System.out.println("Enter month number:");

    int m;
    try{
        m = Integer.parseInt(br.readLine());
        if (m>=1 & m<=12)
        {
            System.out.println("Month number entered is "+m);
        }
        else{
            throw new NumberFormatException("Month has to be between 1 and 12");
        }
    }
    catch(NumberFormatException ne){
        System.out.println("Number format exception caught:" + ne);
    }
    finally{
        System.out.println("Thank you");

    }

}
}