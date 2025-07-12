interface Vehicle {
    public void start();
    public void stop();
}

/** 
In Java, interfaces use extends to inherit from other interfaces — not implements
The keyword implements is used only by classes when they agree to fulfill the contract defined by an interface.
But when one interface is building upon another interface, it’s not providing implementation — it's just extending the contract. 
So Java uses extends, just like it does for class inheritance.
 * **/

interface Car extends Vehicle {
    public void turn_left();
    public void turn_right();
}

class Sedan implements Car
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

public class interface_inheritance
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