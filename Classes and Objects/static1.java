class Employee
{
    static int count;

    Employee()
    {
        count++;
    }

    public static void display()
    {
        System.out.println("count " + count);
    }
}


class static1
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        System.out.println("e1 count "+ e1.count);
        Employee e2 = new Employee(); 
        System.out.println("e2 count "+ e2.count);


        Employee e3 = new Employee();
        System.out.println("e3 count "+ e3.count);
        Employee e4 = new Employee(); 
        System.out.println("e4 count "+ e4.count);


    }
}