package by.belhard.j18.lesson10.threads;

public class MyThread extends Thread{
    private final String name;

    public MyThread(String name) {
        this.name = name;
    }


    @Override
    @SuppressWarnings("Duplicates")
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println(name + " " + i);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
