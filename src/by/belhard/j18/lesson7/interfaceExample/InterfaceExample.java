package by.belhard.j18.lesson7.interfaceExample;

public class InterfaceExample {
    public static void main(String[] args) {
        System.out.println(Workable.defaultAge);

        Workable workable = new Worker();
        workable.work();

    }
}
