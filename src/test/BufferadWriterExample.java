package test;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;



public class BufferadWriterExample {

    public static void main(String[] args) {

        try (BufferedWriter writer = Files.newBufferedWriter(
                Paths.get("sample.txt"),
                Charset.forName("UTF-8"),
                StandardOpenOption.TRUNCATE_EXISTING)){

                writer.write("aaaa");
                writer.newLine();
                writer.write("zzzz");
                writer.newLine();


        } catch (IOException e) {
            e.printStackTrace();
        }





    }

}
