package jp.co.jjs.java_seminar.exercise_20140514_02;

public class Main {

    public static void main(String[] args) {

        Student tarou = new Student(0001, "太郎", "BS", 20, false);
        Student jirou = new Student(0002, "次郎", "PS", 21, false);
        Student saburou = new Student(0003, "三郎", "ES", 22, false);



        System.out.println(tarou.name);
        System.out.println(tarou.number);
        System.out.println(jirou.name);
        System.out.println(saburou.name);
        System.out.println(tarou.syultuketu);


    }

}
