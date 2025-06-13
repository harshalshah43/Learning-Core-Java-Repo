import java.io.*;

interface Person
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

class ActualPerson implements Person, Person2
{
    //override show
    public void show()
    {
        System.out.println("N = " + Person.N);
        System.out.println("M = " + Person.M);
    }

    //override get
    public void get()
    {
        System.out.println("N = " + Person2.N);
        System.out.println("M = " + Person2.M);
    }
}

class InterfaceSample
{
    public static void main(String[] args)
    {
        ActualPerson a = new ActualPerson();
        a.show();
        a.get();
    }
}