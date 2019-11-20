package by.belhard.j18.homework9.task4.entities;

import java.math.BigDecimal;

public class Account {

    private final String name;
    private int amount;

    public Account(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void updateMoney(int amount){
        this.amount += amount;
    }

    @Override
    public String toString() {
        return name + ' ' + amount ;
    }
}
