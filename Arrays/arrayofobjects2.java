import java.io.*;
import java.util.*;

class Passenger{
    // Passenger Details
    String passenger_name;
    int passenger_age;
}

class Ticket extends Passenger
{
    //Ticket Details
    static int count = 0;
    int tid;
    String transport;
    String start_station;
    String end_station;

    float ticket_price = 10;

    Scanner sc = new Scanner(System.in);

    void book_ticket()
    {   
        count++;
        tid = count;
        System.out.println("Passenger Name");
        passenger_name = sc.nextLine();
        System.out.println("Passenger Age");
        passenger_age = sc.nextInt();
        System.out.println("Mode of Transport: Train/Bus");
        sc.next();
        transport = sc.nextLine();
        System.out.println("Start Station");
        start_station = sc.nextLine();
        System.out.println("Stop Station");
        end_station = sc.nextLine();

    }

    void get_ticket()
    {
        System.out.println(tid + " "  +
                        passenger_name + " " + 
                        passenger_age + " " + 
                        transport + " " + 
                        start_station + " " + 
                        end_station);
    }
}

class arrayofobjects2
{
	public static void main(String[] args) 
    {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter no of passengers");
    int n = sc.nextInt();

    Ticket t[] = new Ticket[n];

    for (int i = 0;i < n; i++)
    {
        t[i] = new Ticket();
        t[i].book_ticket();
    }

    for(int i = 0; i< n; i++)
    {
        t[i].get_ticket();
    }

    }
}


// Assignment: Calculate avg weight of Students in a classroom