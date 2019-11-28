package by.belhard.j18.lessons.lesson10.threads2;

public class Counter {
    private int a = 0;

    public synchronized void inc(){
        a++;
    }

    public int getA() {
        return a;
    }
}
