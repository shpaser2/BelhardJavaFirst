package by.belhard.j18.homework9.task4;

import by.belhard.j18.homework9.task4.entities.Transaction;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TransactionsReader {

    public static List<Transaction> readTransactions(String path){
        List<Transaction> result = new ArrayList<>();
        try(BufferedReader rdr = new BufferedReader(new FileReader(path))){
            String[] split;
            while(rdr.ready()){
                split = rdr.readLine().split(" ");
                String sender = split[0];
                String receiver = split[1];
                int amount = Integer.parseInt(split[2]);
                result.add(new Transaction(sender, receiver, amount));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return result;
    }
}
