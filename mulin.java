import java.util.*;


class Data
{
    protected float r;
    public void read(float x)
    {
        r = x;
    }
}

class Area extends Data
{
    protected float area;
    public void calculate_area()
    {
        area = 3.14f * r * r;
    }

    public float display_area()
    {
        // System.out.println("Area:" + area);
        return area;
    }
}

class Volume extends Area
{
    private float volume;

    public void calculate_volume()
    {
        volume = 3.14f * r * r * r;
    }

    public float display_volume()
    {
        return volume;
    }
}

class mulin
{
    public static void main(String[] args)
    {
        float radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleae enter the Radius of the Circle or Sphere");
        radius = sc.nextFloat();

        Volume v = new Volume();

        v.read(radius); // passing value to a function
        v.calculate_area();
        v.calculate_volume();

        System.out.println("Area: " + v.display_area());
        System.out.println("Volume: " + v.display_volume());

    }
}


//syntax for function definition
// access-modifier return-type function-name(datatype1 var1, datatype2 var2){
    //var1 and var2 are called dummy arguments

// }

// System.out.println(var1); //throws error because var1 does not exist outside the function