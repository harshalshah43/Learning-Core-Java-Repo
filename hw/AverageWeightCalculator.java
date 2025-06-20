import java.util.*;

class Student{
    private String name;
    private double age;

    public Student(String name, double age){
        this.name = name;
        this.age = age;
    }

    // public void get_student(){
    //     Scanner sc = new Scaneer(System.in);
    //     SYstem.out.println("Enter name and age of student: ");
    //     name = sc.nextLine();
    //     age = sc.nextDouble();
    // }
    public double get_age(){
        return age;
    }


    public void show_student(){
        System.out.println("name: "+name+"; Age: "+age);
    }
}

class AverageWeightCalculator{
    public static void main(String[] args){
        int n = 5;
        Student s[] = new Student[n]; // created an obj with array

        // s[0] = new Student("Raj", 23);
        // s[1] = new Student("Ravi", 22);
        // s[2] = new Student("Tej", 26);
        // s[3] = new Student("Rajeev", 25);
        // s[4] = new Student("Sanjay", 24);

        Scanner sc = new Scanner(System.in);
        String name;
        double age;
        
        for (int i=0; i<n; i++){
            
            System.out.println("Enter the student name and age: ");
            name = sc.nextLine();
            age = sc.nextDouble();
            sc.nextLine();

            s[i] = new Student(name, age);
        }
    double sum = 0;
        for (int i=0; i<s.length; i++){
            sum += s[i].get_age();
        }
        double average = sum/s.length;

        System.out.println("Average age of the classroom is : "+average);
    }
}