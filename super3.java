//constructors - super()

import java.io.*;

class Animal{   
	Animal(String a)
	{
		System.out.println("animal is created"+a);
	}  

}  
class Dog extends Animal{

	Dog(String x,String y){  
		super(x);  //java automatically understands and calls Animal constructor
		System.out.println("dog is created" + x + y);  
	}  
	// Animal animal = new Animal("ABC");
} 
class super3
{	
	public static void main(String[] args) {
		Dog d = new Dog("A","B");

	}
}