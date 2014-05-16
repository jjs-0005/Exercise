package jp.co.jjs.java_seminar.self_study.q1_15;

public class Self_Study_1_15_3 {

    public static void main(String[] args) {

        double sum = 0;
        int cnt = 0;
        double average = 0;

        // 宣言
        double[] test = new double[4];

        // 初期値設定
        test[0] = 1;
        test[1] = 1;
        test[2] = 2;
        test[3] = 3;

        // 平均値を求める
        for (int i = 0; i < 4; i++) {

            sum += test[i];
            cnt++;
        }

        average = sum / cnt;

        // 表示
        System.out.println(average);

    }

}
