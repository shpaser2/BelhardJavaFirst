package by.belhard.j18.lesson7.interfaceExample;

public class Worker implements Workable, Eatable {

    @Override
    public void eat(String dish) {

    }

    @Override
    public void work(String param) {
        System.out.println("Work hard");
    }
}
