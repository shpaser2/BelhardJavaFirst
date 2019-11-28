package by.belhard.j18.homeworks.homework9.task4;

import by.belhard.j18.homeworks.homework9.task4.entities.Account;
import by.belhard.j18.homeworks.homework9.task4.entities.Transaction;

import java.util.List;

public class TransactionsProcessing {

    public static List<Account> doTransactions(
            List<Account> accounts,
            List<Transaction> transactions)
    {
        for (Transaction transaction : transactions ) {
            doTransaction(transaction, accounts);
        }
        return accounts;
    }

    private static void doTransaction(Transaction transaction, List<Account> accounts){

        if(validateTransaction(transaction, accounts)){
            Account sender =  accounts
                    .stream()
                    .filter(a -> transaction.getSender().equals(a.getName()))
                    .findAny()
                    .get();
            Account receiver =  accounts
                    .stream()
                    .filter(a -> transaction.getReceiver().equals(a.getName()))
                    .findAny()  //optional object, which is wrapper under other result object from filter above
                    .get();         //receive our result object from wrapper. Without check is it empty because we have done this check before.

            sendMoney(sender, receiver, transaction.getAmount());
        }
    }

    private static boolean validateTransaction(Transaction transaction, List<Account> accounts){
        if(accounts.stream().anyMatch(a -> transaction.getSender().equals(a.getName()))
            && accounts.stream().anyMatch(a -> transaction.getReceiver().equals(a.getName()))
            && transaction.getAmount() >= 0
        ){
            Account sender =  accounts
                    .stream()
                    .filter(a -> transaction.getSender().equals(a.getName()))
                    .findAny()
                    .get();
            if(sender.getAmount() >= transaction.getAmount()){
                return true;
            }
        }
        return false;
    }

    private static void sendMoney(Account sender, Account receiver, int amount){
        sender.updateMoney(-amount);
        receiver.updateMoney(amount);
    }
}
