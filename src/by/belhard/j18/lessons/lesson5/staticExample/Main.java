package by.belhard.j18.lessons.lesson5.staticExample;


public class Main {
    public static void main(String[] args) {

        System.out.println(Counter.getCounter());

        Counter counter1 = new Counter("counter1");
        Counter counter2 = new Counter("counter2");

        System.out.println(counter1);
        System.out.println(counter2);

        counter1.inc();
        counter1.inc();

        System.out.println();
        System.out.println(counter1);
        System.out.println(counter2);

        counter2.inc();

        System.out.println();
        System.out.println(counter1);
        System.out.println(counter2);

        Counter counter3 = new Counter("counter3");

        System.out.println();
        System.out.println(counter3);

        System.out.println(Math.PI); //public static final double PI

    }
}
