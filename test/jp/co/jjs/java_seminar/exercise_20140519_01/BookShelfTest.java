package jp.co.jjs.java_seminar.exercise_20140519_01;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.ArrayList;

import org.junit.Test;

public class BookShelfTest {

    @Test
    public void getAllメソッドを実行するとBookShelfが保持している件数分のBookオブジェクトを返すこと() {

        BookShelf bookShelf = new BookShelf();
        bookShelf.bookList.add(new Book("title", "isbn", "author", "publisher", 1000));
        bookShelf.bookList.add(new Book("title", "isbn", "author", "publisher", 2000));
        bookShelf.bookList.add(new Book("title", "isbn", "author", "publisher", 3000));

        ArrayList<Book> actual = bookShelf.getAll();
        assertThat(actual.size(), is(3));
    }

    @Test
    public void getAllメソッドを実行するとBookShelfが保持しているすべてのBookオブジェクトを返すこと() {

        BookShelf bookShelf = new BookShelf();
        bookShelf.bookList.add(new Book("title", "isbn", "author", "publisher", 1000));
        bookShelf.bookList.add(new Book("title", "isbn", "author", "publisher", 2000));
        bookShelf.bookList.add(new Book("title", "isbn", "author", "publisher", 3000));

        ArrayList<Book> actual = bookShelf.getAll();
        assertThat(actual.getTitle(), is("title"));
    }



}
