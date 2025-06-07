import java.io.*;
import java.util.*;

abstract class Employee
{
    String firstname, lastname,dept;

    float age, salary;

    abstract void processEmployee();
    abstract void displayDetails();

    void incrementSalary(double percent)
    {
        salary += percent * salary;
    }
}

class Typist extends Employee
{
    void processEmployee()
    {   
        System.out.println("Please Enter first,lastname, age, dept and salary of the new employee");
        Scanner sc = new Scanner(System.in);
        firstname = sc.nextLine();
        lastname = sc.nextLine();
        age = sc.nextInt();
        sc.nextLine();
        dept = sc.nextLine();
        salary = sc.nextFloat();
    }

    void displayDetails()
    {
        System.out.println("Name :" + firstname + lastname + "Age :" + age + "Salary :" + salary);
    }
}

// Create Accountant class that inherits Employee class and call its methods from main method

class abstract1
{
    public static void main(String[] args)
    {
        Typist t = new Typist();
        t.processEmployee();
        t.displayDetails();
        t.incrementSalary(0.1);
        t.displayDetails();
    }
}
