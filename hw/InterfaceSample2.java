// Interface with three methods
interface I {
    void methodOne();
    void methodTwo();
    void methodThree();
}

// Class A implements interface I
class A implements I {
    public void methodOne() {
        System.out.println("Class A - Method One");
    }
    public void methodTwo() {
        System.out.println("Class A - Method Two");
    }
    public void methodThree() {
        System.out.println("Class A - Method Three");
    }
}

// Class B implements interface I
class B implements I {
    public void methodOne() {
        System.out.println("Class B - Method One");
    }
    public void methodTwo() {
        System.out.println("Class B - Method Two");
    }
    public void methodThree() {
        System.out.println("Class B - Method Three");
    }
}

// Main class to test the implementation
public class InterfaceSample2 {
    public static void main(String[] args) {
        I objA = new A();
        I objB = new B();

        // Calling methods from class A
        objA.methodOne();
        objA.methodTwo();
        objA.methodThree();

        // Calling methods from class B
        objB.methodOne();
        objB.methodTwo();
        objB.methodThree();
    }
}
