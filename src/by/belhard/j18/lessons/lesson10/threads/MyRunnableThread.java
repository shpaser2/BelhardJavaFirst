package by.belhard.j18.lessons.lesson10.threads;

public class MyRunnableThread  implements  Runnable{

    private final String name;

    public MyRunnableThread(String name) {
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
