import java.io.*;

interface Person1
{
    final static int N = 100, M = 101;
    
    //fn declarations
    public void show();
    public void get();
}

interface Person2
{
    final static int N = 200, M = 201;
    
    //fn declarations
    public void show();
    public void get();
}

class ActualPerson implements Person1,Person2
{
    //override show
    public void show()
    {
        System.out.println("N = " + Person1.N);
        System.out.println("M = " + Person1.M);
    }

    //override get
    public void get()
    {
        System.out.println("N = " + Person2.N);
        System.out.println("M = " + Person2.M);
    }
}

class interface2
{
    public static void main(String[] args)
    {
        ActualPerson a = new ActualPerson();
        a.show();
        a.get();
    }
}


// Assignment
// Create an interface with three methods
// Implement it in two classes I->A, I->B 
// Call all the six methods from the Main class