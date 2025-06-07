import java.io.*;
import java.util.*;

abstract class Product
{
    String product_name;
    String product_id;
    String product_description;
    double product_price;

    abstract void get_ProductDetails();
    abstract void set_ProductDetails();
}

class Laptop extends Product
{
    String diskspace;
    String memory;
    int cpus; // number of cpus

    Scanner sc = new Scanner(System.in);

    //Method Overriding
    public void get_ProductDetails()
    {
        product_name =  sc.nextLine();
        System.out.println("Enter the product name")
        product_id = sc.nextLine();
        System.out.println("Enter the product id")
        product_description = sc.nextLine();
        System.out.println("Enter the product description")
        product_price = sc.nextFloat();
        System.out.println("Enter the product price")
        diskspace = sc.nextLine();
        System.out.println("Enter the diskspace")
        memory = sc.nextLine();
        System.out.println("Enter the memory")
        cpus = sc.nextInt();
        System.out.println("Enter the cpus")
    }

    public void set_ProductDetails()
    {
        System.out.println("product name");
        System.out.println("product id");
        System.out.println("product price");
        System.out.println("product description");
        System.out.println("product memory");
        System.out.println("diskspace");
        System.out.println("cpus");
    }

}

class MixerGrinder extends Product
{

    // Complete this
}