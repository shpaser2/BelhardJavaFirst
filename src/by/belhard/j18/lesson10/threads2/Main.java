package by.belhard.j18.lesson10.threads2;

/**
 * Example of threads optimization.
 * Java sometimes allows one time access from different thread to one data.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread thread1 = new Thread(new MyThreadCounter(counter));
        Thread thread2 = new Thread(new MyThreadCounter(counter));
        Thread thread3 = new Thread(new MyThreadCounter(counter));

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(counter.getA());

    }
}
