import java.io.*;
import java.util.*;

class singleinheritance{
public static void main (String args[]) {
    int x,y;
    x = Integer.parseInt(args[0]);
    y = Integer.parseInt(args[1]);

    Sum s = new Sum();
    s.read(x,y);
    s.add();
    s.display();
}
}