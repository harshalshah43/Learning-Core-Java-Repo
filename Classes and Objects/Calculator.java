

public class Calculator {
    int a,b,result; //class variables


    public Calculator(int x,int y)
    {   
        a = x;
        b = y;
        int addition_result = add();
        float subtraction_result = sub();

        System.out.println("Addition" + addition_result);
        System.out.println("Subtraction result " + subtraction_result);
    }   



    //function creation or definition
    public int add() // dummy arguments or formal arguments 
    {

        result = a + b;
        return result;
    }

    public float sub()
    {

        result = a - b;
        return result;
    }

}



//class members
    // memeber variables
    // member functions

    // member function can freely access member variables


