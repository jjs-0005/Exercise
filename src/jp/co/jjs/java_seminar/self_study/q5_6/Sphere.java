package jp.co.jjs.java_seminar.self_study.q5_6;

public class Sphere {

    double hankei;
    double zahyou;

    double a;
    double b;
    double c;


    public Sphere(double hankei, double zahyou) {
        super();
        this.hankei = hankei;
        this.zahyou = zahyou;
    }

    public double move (double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;

        return move(a, b, c);
    }
}
