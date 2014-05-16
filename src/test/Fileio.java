package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 *  暗記
 *
 *
 */

public class Fileio {

    public static void main(String[] args) {

        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get("sample.txt"),
                Charset.forName("UTF-8"))){

            String line = null;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
