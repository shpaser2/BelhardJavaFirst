package by.belhard.j18.lessons.lesson10.threads;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        //Threads are created
        Thread thread1 = new MyThread("thread1");
        Thread thread2 = new MyThread("thread2");
        Thread thread3 = new Thread(new MyRunnableThread("thread3"));
        //Create daemon thread with instance of based on anonymous
        // class with Runnable interface.
//        Thread threadDaemon = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    for (;;) {
//                        Thread.sleep(200);
//                        System.out.println(".");
//                    }
//                }catch(InterruptedException e){
//                    e.printStackTrace();
//                }
//            }
//        });
        //example of creating deamon thread with lambda
            //in this lambda we wrote implementation of run()
        //It works only with @FunctionalInterface.
        //  Interface, where only one method is abstract.
        //  Why Runnable? Because Thread() requires only Runnable with run().
        //If there are only 1 param, then () before -> is not necessary.
        Thread threadDaemon = new Thread(() -> {
            try {
                for (;;) {
                    Thread.sleep(200);
                    System.out.println(".");
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        });

//        //sequence of calls
//        thread1.run();
//        thread2.run();
        //Start our threads.
        //Main thread go next to actions without
        // waiting of new threads execution.
        thread1.start();
        thread2.start();
        thread3.start();
        //threadDaemon.start();   //as usual thread
        threadDaemon.setDaemon(true);   //all daemon threads ends when not daemon threads ended
        threadDaemon.start();
        //Main thread waits for end of thread1 and thread2 in next two lines.
        thread1.join();
        thread2.join();


        System.out.println("main thread ends");
    }
}
