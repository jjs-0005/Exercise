package jp.co.jjs.java_seminar.exercise_20140515_03;

import java.util.HashMap;


public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        //map("キー", 値)
        map.put("aaa", 0);
        map.put("bbb", 1);
        map.put("ccc", 2);


        //値の一覧表示
        System.out.println(map.values());


        //キーの一覧表示
        System.out.println(map.keySet());


        //mapのキーと値を表示
        System.out.println(map);

        //キーを使って値を取り出す。
        System.out.println(map.get("aaa"));
        System.out.println(map.get("bbb"));
        System.out.println(map.get("ccc"));







    }

}
