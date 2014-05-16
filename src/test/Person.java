package test;

public class Person {

    private String name;
    private double height; //単位：メートル


    public Person(String name) {

        this.name = name;
    }

    public void setHeight(double meter) {
        if(meter < 0) {
            System.out.println("正の数で入力してください");
            return;
        }
        this.height = meter;
    }

    public double getMeter() {
        return this.height;
    }

    public double getFeet() {
        return this.height * 3.28;
    }

    public String getName() {
        return this.name;
    }



}
