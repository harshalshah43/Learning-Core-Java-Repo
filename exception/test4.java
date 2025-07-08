import java.io.*;
class test4{
public static void main(String args[])throws IOException{
   int a=0,b=0,res;
   String choice = "c";
   BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
   String str;
   System.out.println("Enter two numbers:");

    str=br.readLine();
    a=Integer.parseInt(str);
    str=br.readLine();
    b=Integer.parseInt(str);
    res=a/b;
    System.out.println("The Quotient=" + res);

   }
}
