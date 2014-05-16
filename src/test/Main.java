package test;

public class Main {

    public static void main(String[] args) {

        Person kounoike = new Person("鴻池");

        //kounoike.height = 1.63;

        kounoike.setHeight(1.63);

        kounoike.getMeter();
        kounoike.getFeet();

        System.out.println(kounoike.getMeter());

        System.out.println(kounoike.getName());
    }
}
