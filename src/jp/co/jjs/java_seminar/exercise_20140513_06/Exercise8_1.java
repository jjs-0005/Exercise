package jp.co.jjs.java_seminar.exercise_20140513_06;

public class Exercise8_1 {

    public static void main(String[] args) {

         String day = "月曜日";

        switch (day) {

        case "月曜日":

            System.out.println("今日は月曜日です。布団から出たくないです。" );

            break;
        case "火曜日":

            System.out.println("今日は火曜日です。まだ火曜日です" );

            break;
        case "水曜日":

            System.out.println("今日は水曜日です。もう少しで金曜日です。" );

            break;

        case "木曜日":

            System.out.println("今日は木曜日です。あと1日です。" );

            break;

        case "金曜日":

            System.out.println("今日は金曜日です。やっと金曜日です。" );

            break;

        case "土曜日":

            System.out.println("今日は土曜日です。テンション高いです。" );

            break;

        case "日曜日":

            System.out.println("今日は日曜日です。また明日から月曜日です。" );

            break;


        default:
            break;
        }
    }

}
