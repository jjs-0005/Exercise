package jp.co.jjs.java_seminar.exercise_20140515_01;

public class IntegerExample {

    public static void main(String[] args) {

        String str = "125";

        Integer obj = Integer.valueOf(str);
        int i = obj.intValue();
        i += 10;

        System.out.println(i);

        /*--------------------------------------------*/

         String s = "125";
         Integer integer = Integer.valueOf(s);
         int num = integer.intValue();
         num += 100;

         String str2 = Integer.toHexString(num);
         System.out.println(str2);

         System.out.println(Integer.MAX_VALUE);
         System.out.println(Integer.MIN_VALUE);
    }

}
