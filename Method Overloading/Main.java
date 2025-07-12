public class Main {
    public static void main(String[] args) {
        Circle circleobj1 = new Circle();  // calling a default 
        Circle circleobj2 = new Circle(20.5f); // calling paramerized
        String[] names = new String[]{"Harshal","Krrish"};
        Circle circleobj3 = new Circle(names); // calling paramerized


        circleobj1.calculate();
        circleobj2.calculate();

        circleobj1.display();
        circleobj2.display();

    }
}
