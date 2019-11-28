package by.belhard.j18.lessons.lesson9.io;

import java.io.*;

public class IOExample {
    public static void main(String[] args) {

        File file = new File("testInput.ti");

        try (InputStream input = new FileInputStream(file);
             OutputStream output = new FileOutputStream("testOutput.to")) {

            int read = 1;
            while (read > 0) {
                read = input.read();
                System.out.print((char) read);
                output.write(read + 1);
                System.out.println((char) (read + 1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
