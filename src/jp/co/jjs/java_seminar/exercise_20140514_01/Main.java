package jp.co.jjs.java_seminar.exercise_20140514_01;

public class Main {

    public static void main(String[] args) {

        String str = "abcd";
        int num = 10;
        Book book1 = new Book("独習JAVA");
        Book book2 = new Book("Effective Java");
        Book book3 = new Book("独習C++");

        System.out.println(book1.bookname);
        System.out.println(book2.bookname);
        System.out.println(book3.bookname);

    }

}
