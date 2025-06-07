import java.util.*;
import java.io.*;


class A{
  int a= 10;
   void read(){
    System.out.println("read base");
   }
}


class B extends A{ 
  int a = 20;
  void read()
   {
    System.out.println("read derived"+ "a = " + a + "super a" + super.a);
   }
}


class hiin{
  public static void main(String[] args) {
    B b = new B();
    b.read();  // read of derived class overrides the read of base
  }
}