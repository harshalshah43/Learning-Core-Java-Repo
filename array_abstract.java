import java.util.*;
abstract class Employee
{
    String name;
    double salary;

    abstract void setname(String name);
    abstract void setsal(double salary);

    abstract String getname();
    abstract double getsal();
}

class Accountant extends Employee
{  
    int experience;

    void setname(String name)
    {
        this.name = name;
    }

    void setsal(double salary)
    {
        this.salary = salary;
    }
   
    String getname()
    {
        return name;
    } 

    double getsal()
    {
        return salary;
    }

}

public class array_abstract
{
    public static void main(String args[])
    {   int n = 3;
        Employee e[] = new Accountant[n];

        Scanner sc = new Scanner(System.in);
        for (int i=0;i<n;i++)
            {
              e[i] = new Accountant();
              System.out.println("Enter name of employee " + (i+1));
              e[i].setname(sc.nextLine());
              System.out.println("Enter salary of employee " + (i+1));
              e[i].setsal(sc.nextDouble());
              sc.nextLine();  
            }
            
            System.out.println("--------------");

            for (int i=0;i<n;i++)
            {
              System.out.println(e[i].getname() +  "\t" + e[i].getsal());
            }
    }
}

