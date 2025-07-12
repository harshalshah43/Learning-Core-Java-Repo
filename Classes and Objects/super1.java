//super keyword 
//variables - super.variable_name
//class method - super.method()
//constructors - super().constructor_name()

import java.io.*;

class Animal
{  
protected final String color="white";  
} 

class Dog extends Animal
{  
String color="black";  
void printColor()
{  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  
}  

class super1
{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.printColor();
	}
}
