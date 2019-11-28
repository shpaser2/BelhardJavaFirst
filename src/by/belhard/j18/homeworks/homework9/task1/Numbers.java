package by.belhard.j18.homeworks.homework9.task1;

import java.io.FileWriter;
import java.io.IOException;

public class Numbers {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("hw9t1f1.txt", true))
        {
            for(int i = 0; i < 6; i++)
                writer.append(i + " ");
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        try(FileWriter writer = new FileWriter("hw9t1f2.txt", true))
        {
            for(int i = 0; i < 6; i++)
                writer.append(i*i + " ");
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}


