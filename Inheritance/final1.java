//if a class is declared public, the filename must match the class name exactly — including capitalization.

import java.util.*;

class Base
{
    float r,vol;

    void assign_radius(float x)
    {
        this.r =x;
    }
    
    final void display()
    {
        System.out.println("Volume " + vol);
    }
}

class Sphere extends Base
{   
    public void calculate()
    {   
        vol = 3.14f * r * r * r * 4/3;   // 4/3 pi r^3
    }
}

class Hemisphere extends Base
{
    public void calculate()
    {   
        vol = 3.14f * r * r * r * 2 / 3;  // 2/3 pi r^3
    }
}


class final1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius of a Sphere");

        float r;
        r = sc.nextFloat();

        //Sphere Object
        Sphere s = new Sphere();
        s.assign_radius(r);
        s.calculate();
        s.display();


        //HemiSphere Object
        Hemisphere h = new Hemisphere();
        h.assign_radius(r);
        h.calculate();
        h.display();
    }
}