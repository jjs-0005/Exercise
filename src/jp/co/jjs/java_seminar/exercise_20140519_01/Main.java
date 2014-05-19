package jp.co.jjs.java_seminar.exercise_20140519_01;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {



        ArrayList<Book> books = BookReader.read("BookList.csv");
        BookShelf bookshelf = new BookShelf();
        bookshelf.addAll(books);
        bookshelf.showAll();



    }
}
