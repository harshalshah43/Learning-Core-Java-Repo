import java.io.*;

interface Person
{
    final static int N = 100, M = 101;
    
    //fn declarations
    public void show();
    public void get();
}

class ActualPerson implements Person
{
    //override show
    public void show()
    {
        System.out.println("N = " + N);
        System.out.println("M = " + M);
    }

    //override get
    public void get()
    {
        
    }
}

class interface1
{
    public static void main(String[] args)
    {
        ActualPerson a = new ActualPerson();
        a.show();
    }
}