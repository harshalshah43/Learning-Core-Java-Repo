import java.io.*;
import java.util.*;

class passenger{
    String passenger_name;
    int passenger_age;
}
class Ticket extends passenger{
    static int count = 0;
    int tid;
    
    String transport;
    
    String start_station;
    String end_station;
    float ticket_price= 10;

    Scanner sc = new Scanner(System.in);
    void book_ticket(){
        count++;
        tid = count;
        System.out.println("passenger_name: ");
        passenger_name = sc.nextLine();
        System.out.println("passenger_age: ");
        passenger_age = sc.nextInt();
        sc.nextLine();
        System.out.println("transport: ");
        transport = sc.nextLine();
        System.out.println("start_station: ");
        start_station = sc.nextLine();
        System.out.println("end_station: ");
        end_station = sc.nextLine();
    }

    void get_ticket(){
        System.out.println("Ticket ID: "+tid 
                            +"\nPassenger Name: "+passenger_name
                            +"\nPassenger Age: "+passenger_age
                            +"\nTransaport: "+transport
                            +"\nStart Station: "+start_station
                            +"\nEnd Station: "+end_station);
    }
}
class ArrayOfObjects2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of passanger: ");
        int n = sc.nextInt();

        Ticket t[] = new Ticket[n];

        for(int i =0; i<n; i++){
            t[i] = new Ticket();
            t[i].book_ticket();
        }
        for(int i=0; i<n; i++){
            t[i].get_ticket();
        }
    }

}

//Calculate the avg weight of the student in a classroom
