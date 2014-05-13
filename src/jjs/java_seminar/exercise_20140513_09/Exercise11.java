package jjs.java_seminar.exercise_20140513_09;

public class Exercise11 {

    public static void main(String[] args) {

        int a, b, c, oturi, man, B5k, B1k, B2k, c500, c100, c50, c10, c5, c1;

        a = 2600;                       /* 買い物の合計 */

        b = 5000;                       /* 支払額          */


        c = b - a;                      /* お釣りの合計 */

        System.out.println( c + "円" );

        man = c / 10000;
        System.out.println("1万円札"+ man + "枚");

        oturi = c - (man * 10000);

        B5k = c / 5000;
        System.out.println("5千円札"+ B5k + "枚");

        oturi = c - (B5k * 5000);

        B2k = oturi / 2000;
        System.out.println("2千円札"+ B2k + "枚");

        oturi = oturi - (B2k * 2000);


        B2k = oturi / 1000;
        System.out.println("1千円札"+ B2k + "枚");

        oturi = oturi - (B2k * 1000);

        c500 = oturi / 500;
        System.out.println("500円玉"+ c500 + "枚");

        oturi = oturi - (c500 * 500);

        c100 = oturi / 100;
        System.out.println("100円玉"+ c100 + "枚");

        oturi = oturi - (c100 * 100);

        c50 = oturi / 50;
        System.out.println("50円玉"+ c50 + "枚");

        oturi = oturi - (c50 * 50);

        c10 = oturi / 10;
        System.out.println("10円玉"+ c10 + "枚");

        oturi = oturi - (c10 * 10);

        c5 = oturi / 5;
        System.out.println("5円玉"+ c5 + "枚");
        oturi = oturi - (c5 * 5);

        c1 = oturi / 1;
        System.out.println("1円玉"+ c1 + "枚");

        oturi = oturi - (c1 * 1);

    }
}


