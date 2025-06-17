import java.util.*;
class Employee
{
    private String empname, designation;
    private int empid;
    private float salary;

void get_employee() 
      {
          Scanner sc = new Scanner (System.in);
          System.out.println("Enter name, ID , designation and salary:");
          empname=sc.next();
          empid=sc.nextInt();
          designation=sc.next();
          salary=sc.nextFloat();
      }

void show_employee() 
      {
          System.out.println(empname+"\t"+empid+"\t"+designation+"\t"+salary);
      }
}

class arrayofobjects
    {
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number of Employees");
            int n = sc.nextInt();

            // int a[] = new int[n]; // array is declared, space is alloted

            Employee e[] = new Employee[n]; // declare array of objects. but no space is allocated

            for (int i=0;i<n;i++)
            {
              e[i] = new Employee(); // now space is alloted, because this is object creation
              e[i].get_employee();
            }
            
            System.out.println("--------------");

            for (int i=0;i<n;i++)
            {
              e[i].show_employee();
            }

        }
    }

//Assignment

// Create Student class, name, age, admission_date
// create two methods one getter and setter and store this as array of objects