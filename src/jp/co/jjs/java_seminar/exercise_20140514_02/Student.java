package jp.co.jjs.java_seminar.exercise_20140514_02;

public class Student {

    int     number;       // 生徒番号
    String  name;         // 生徒名
    String  affiliation;    // 所属
    int     age;            // 年齢
    double  progress_rate;  // 進捗率


    boolean syultuketu;     // 出欠状態

    public Student(int number, String name, String affiliation, int age, boolean syultuketu ) {


        this.name = name;
        this.affiliation = affiliation;
        this.age = age;

    }



}
