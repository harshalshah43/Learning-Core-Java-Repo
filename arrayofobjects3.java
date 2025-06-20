import java.util.*;
class Student
{
    private String name;
    private double age;

    public Student(String name, double age)
    {
        this.name = name;
        this.age = age;
    }

    public void show_student()
    {
        System.out.println("Name " + name + "Age" + age);
    }

    public double getAge()
    {
        return age;
    }
}

class AgeCalculator
{   
    public Student[] getStudentDetails(Student s[])
    {
        // Taking student details from user
        Scanner sc = new Scanner(System.in);
        String name;
        double age;
        for(int i= 0;i < s.length;i++)
        {   
            name = sc.nextLine();
            age = sc.nextDouble();
            sc.nextLine();
            s[i] = new Student(name,age);                    
        }

        return s;
    }
    public double calculateAge(Student s[])
    {   
        // Calulate Average Age of Students in a classroom
        
        double sum = 0;
        for(int i = 0; i < s.length; i++)
        {
            sum += s[i].getAge();
        }
        double average = sum/s.length;
        
        return average;
    }
}

class arrayofobjects3
{
    public static void main(String[] args)
    {       
        int n = 5;
        Student s[] = new Student[n]; // s is an array of objects
        
        // s[0] = new Student("ABC",23);
        // s[1] = new Student("PQR",25);
        // s[2] = new Student("XYZ",26);
        // s[3] = new Student("DCE",27);
        // s[4] = new Student("DEF",28);

        AgeCalculator a = new AgeCalculator(); //Single object
        s = a.getStudentDetails(s);

        double average = a.calculateAge(s);
        System.out.println("Average age of the classroom is :" + average);
        
    }
}