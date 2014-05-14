package jp.co.jjs.java_seminar.exercise_20140514_01;

public class Book {

    int     bookid;     //管理ID
    String  bookname;   //名前
    String  authord;    //著者
    String  genre;      //ジャンル
    boolean bookrental; //貸出状況

    public Book(String bookname) {

        this.bookname = bookname;

    }


}
