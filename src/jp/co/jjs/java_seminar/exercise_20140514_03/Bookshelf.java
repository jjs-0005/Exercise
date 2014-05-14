package jp.co.jjs.java_seminar.exercise_20140514_03;

public class Bookshelf {

    Book[] books = new Book[10];

    public void set(Book book) {
        for(int i = 0; i < books.length; i++){
            if(books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }
}
