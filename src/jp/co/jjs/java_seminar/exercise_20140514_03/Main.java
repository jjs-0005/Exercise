package jp.co.jjs.java_seminar.exercise_20140514_03;

public class Main {

    public static void main(String[] args) {

        Bookshelf bookshelf = new Bookshelf();

        Book book = new Book(001, "aaaa", "aaaa");

        bookshelf.set(book);

        System.out.println(bookshelf.books[0].title);
    }
}
