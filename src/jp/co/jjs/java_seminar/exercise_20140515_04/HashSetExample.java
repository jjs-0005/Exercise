package jp.co.jjs.java_seminar.exercise_20140515_04;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        //HashSet<Book> book = new HashSet<>();

        //追加
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        //表示　①
        System.out.println(set);

        //追加
        set.add("bbb");

        //表示　②
        System.out.println(set);

        //削除
        set.remove("bbb");

        //表示　③
        System.out.println(set);


    }

}
