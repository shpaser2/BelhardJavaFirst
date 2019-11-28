package by.belhard.j18.homeworks.homework9.task4;

import by.belhard.j18.homeworks.homework9.task4.entities.Account;
import by.belhard.j18.homeworks.homework9.task4.entities.Transaction;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accounts = AccountReader.readAccounts("input1.txt");
        List<Transaction> transactions = TransactionsReader.readTransactions("input2.txt");
        List<Account> newAccounts = TransactionsProcessing.doTransactions(accounts, transactions);

        AccountsWriter.writeAccounts(newAccounts, "output.txt");
    }
}
