package jp.co.jjs.java_seminar.exercise_20140519_01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class BookWriter {

    public static void write(String csvFilePath, ArrayList<Book> books) {


    try (BufferedWriter writer = Files.newBufferedWriter(
            Paths.get("csvFilePath"),
            Charset.forName("UTF-8"))){

        for(Book book: books) {

            writer.write(book.getTitle() + ",");
            writer.write(book.getIsbn() + ",");
            writer.write(book.getAuthor() + ",");
            writer.write(book.getPublisher() + ",");
            writer.write(String.valueOf(book.getPrice()));
            writer.newLine();

        }

    } catch (IOException e) {
        e.printStackTrace();
    }


    }

}
