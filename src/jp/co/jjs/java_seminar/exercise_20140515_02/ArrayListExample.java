package jp.co.jjs.java_seminar.exercise_20140515_02;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        //listに追加
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //現在listに格納されている内容を表示
        System.out.println(list);

        //listのサイズ表示
        System.out.println("listのサイズは　" + list.size());

        //listの先頭を削除
        list.remove(0);

        //現在listに格納されている内容を表示
        System.out.println(list);

        //listのサイズ表示
        System.out.println("listのサイズは　" + list.size());

        //現在listに格納されている内容を表示
        System.out.println("現在listに格納されているものは　" + list);
    }
}
