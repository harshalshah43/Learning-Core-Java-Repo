import java.util.*;

class Student{
    double weight;
    public Student (double weight){
        this.weight = weight;
    }
}

class AverageCalculator{
    public double getAverage(Student[] students){
        double sum = 0;
        for(int i =0; i<students.length; i++){
            sum+= students[i].weight;
        }
        return sum/students.length;
    }
}

public class AverageWeightCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students= new Student[n];

        for (int i=0; i<n; i++){
            System.out.println("Enter the weight of the student: "+(i+1)+": ");
            double w = sc.nextDouble();
            students[i] = new Student(w);
        }

        AverageCalculator calc = new AverageCalculator();
        double avg = calc.getAverage(students);

        System.out.println("Average weight of students: "+avg);
        sc.close();
    }
}