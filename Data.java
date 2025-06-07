import java.io.*;
import java.util.*;

class Data
{
protected int a, b;

public void read(int x, int y)
{
  a=x;
  b=y;
}
}

class Sum extends Data
{
private int sum;
public void add()
{
   sum=a+b;
}
public void display()
{
   System.out.println("Sum="+sum);
}
}