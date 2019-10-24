package by.belhard.j18.lesson5.staticExample;

public class Counter {
    private static int counter = 0;
    private static int counters = 0;    //счетчик созданных объектов
    private String str;
    static{
        counter = -100; //вызовется до вызова конструктора и изменит переменную статическую
    }

    public Counter(String str) {
        this.str = str;
        counters++;
    }

    public Counter() {
        counters++;
    }

    public void inc(){
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static int getCounter(Counter counter) {
        String s = counter.str; //костылей гора
        return counter.counter; //Это можно,
        //return this.counter;    //а вот это нельзя уже
    }

    @Override
    public String toString() {
        return "Counter " + str + " " + counter;
    }
}
