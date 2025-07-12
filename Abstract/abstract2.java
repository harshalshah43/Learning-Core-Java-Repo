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
        System.out.println("Enter the product name");
        product_name =  sc.nextLine();
        
        System.out.println("Enter the product id");
        product_id = sc.nextLine();
        
        System.out.println("Enter the product description");
        product_description = sc.nextLine();
        
        System.out.println("Enter the product price");
        product_price = sc.nextFloat();
        
        System.out.println("Enter the diskspace");
        diskspace = sc.nextLine();
        
        System.out.println("Enter the memory");
        memory = sc.nextLine();
        
        System.out.println("Enter the cpus");
        cpus = sc.nextInt();
    }

    public void set_ProductDetails()
    {
        System.out.println("product name"+);
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
    String material;
    String numberOfJars;
    int voltage; // number of cpus

    Scanner sc = new Scanner(System.in);

    //Method Overriding
    public void get_ProductDetails()
    {
        
        System.out.println("Enter the product name");
        product_name =  sc.nextLine();
        
        System.out.println("Enter the product id");
        product_id = sc.nextLine();
        
        System.out.println("Enter the product description");
        product_description = sc.nextLine();
        
        System.out.println("Enter the product price");
        product_price = sc.nextFloat();
        
        System.out.println("Enter the material");
        material = sc.nextLine();
        
        System.out.println("Enter the number of Jars provided");
        numberOfJars = sc.nextLine();
        
        System.out.println("Enter the input voltage");
        voltage = sc.nextInt();
    }

    public void set_ProductDetails()
    {
        System.out.println("product name: "+product_name);
        System.out.println("product id: ");
        System.out.println("product price: ");
        System.out.println("product description: ");
        System.out.println("product material: ");
        System.out.println("number of jars provided: ");
        System.out.println("voltage: ");
    }

}

class abstract2 {
    public static void main(String args[]){
        Laptop t = new Laptop();
        t.get_ProductDetails();
        t.set_ProductDetails();

        MixerGrinder t1 = new MixerGrinder();
        t1.get_ProductDetails();
        t1.set_ProductDetails();
    }
}