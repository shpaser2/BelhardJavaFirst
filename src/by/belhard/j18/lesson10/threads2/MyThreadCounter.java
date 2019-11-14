package by.belhard.j18.lesson10.threads2;

public class MyThreadCounter implements Runnable{

    private final Counter counter;

    public MyThreadCounter(Counter counter) {
        this.counter = counter;
    }


    @Override
    public void run() {

        for(int i = 0; i < 10000; i++ ) {
            //not synchronized access   22k..30k
//                counter.inc();
            //synchronized access       30k output always
//            synchronized (counter) {  //but more good is to sync inc().
                                        //And it is ready in this example.
                counter.inc();
//            }
        }
        System.out.println("thread ends");
    }
}
