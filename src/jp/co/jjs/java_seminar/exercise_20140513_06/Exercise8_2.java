package jp.co.jjs.java_seminar.exercise_20140513_06;

public class Exercise8_2 {

    public static void main(String[] args) {

        String day = "日曜日";

        if (day.equals("月曜日")) {

            System.out.println("今日は月曜日です。布団から出たくないです。");

        } else if (day.equals("火曜日")) {

            System.out.println("今日は火曜日です。まだ火曜日です" );

        } else if(day.equals("水曜日")) {

            System.out.println("今日は水曜日です。もう少しで金曜日です。" );

        } else if(day.equals("木曜日")) {

            System.out.println("今日は木曜日です。あと1日です。" );

        } else if(day.equals("金曜日")) {

            System.out.println("今日は金曜日です。やっと金曜日です。" );

        } else if(day.equals("土曜日")) {

            System.out.println("今日は土曜日です。テンション高いです。" );

        }else if(day.equals("日曜日")){

            System.out.println("今日は日曜日です。また明日から月曜日です。" );

        }
    }

}
