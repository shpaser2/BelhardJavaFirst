package by.belhard.j18.homeworks.homework9.task4;

import by.belhard.j18.homeworks.homework9.task4.entities.Account;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AccountsWriter {
    public static void writeAccounts(List<Account> newAccounts, String path){
        try (BufferedWriter wrt = new BufferedWriter(new FileWriter(path))){
            for(Account account : newAccounts){
                wrt.write(account.toString());
                wrt.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
