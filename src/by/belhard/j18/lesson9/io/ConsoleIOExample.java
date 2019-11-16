package by.belhard.j18.lesson9.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleIOExample {

    public static void main(String[] args) {

        try (BufferedReader rdr = new BufferedReader(
                new InputStreamReader(System.in))) {

            String s = "";

            while (!"exit".equals(s)) {

                s = rdr.readLine();

                System.out.println(s.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
