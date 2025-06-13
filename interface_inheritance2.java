interface Vehicle {
    public void start();
    public void stop();
}

abstract class Car implements Vehicle {
    abstract public void turn_left();
    abstract public void turn_right();  
}

class Sedan extends Car
{
    @Override    
    public void start() {
        System.out.println("Car started");
    }
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
    @Override
    public void turn_left() {
        System.out.println("Turning Left");
    }
    @Override
    public void turn_right()
    {
        System.out.println("Turning Right");
    }

    public void open_trunk()
    {
        System.out.println("Opening Trunk");

    }
}

public class interface_inheritance2
{
    public static void main(String[] args)
    {
        Sedan car = new Sedan();
        car.start();
        car.turn_left();
        car.turn_right();
        car.stop();
        car.open_trunk();
    }
}