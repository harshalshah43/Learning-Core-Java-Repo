import java.io.*;
class test2{
public static void main(String args[]) throws IOException{
   int a=0,b=0,res;
   BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
   String str;
   System.out.println("Enter two numbers:");
   try
   {
      str=br.readLine();
      a=Integer.parseInt(str);
      str=br.readLine();
      b=Integer.parseInt(str);
   }
   catch (NumberFormatException ne)
   {
      System.out.println("Invalid number");
   }
   try
   {
      res=a/b;
      System.out.println("The Quotient=" + res);
   }
   catch(ArithmeticException ae)
   {
      System.out.println("Exception has occurred. You have entered the divisor as zero");
   }   

   }
}
