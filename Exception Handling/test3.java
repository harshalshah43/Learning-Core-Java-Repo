import java.io.*;
class Divide{
public static void main(String args[]) throws IOException{
   int a=0,b=0,res;
   String choice = "c";
   BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
   String str;
   System.out.println("Enter two numbers:");
   do
      {
         try
         {
            str=br.readLine();
            a=Integer.parseInt(str);
            str=br.readLine();
            b=Integer.parseInt(str);
            res=a/b;
            System.out.println("The Quotient=" + res);
         }
         catch(ArithmeticException ae)
         {
            System.out.println("Exception has occurred. You have entered the divisor as zero");
         }   
         catch (NumberFormatException ne)
         {
            System.out.println("Invalid number");
         }
         finally{
            System.out.println("Exit or continue ? e/c");
            choice = br.readLine();
         }
      }while(choice.equals("c"));
   }
}
