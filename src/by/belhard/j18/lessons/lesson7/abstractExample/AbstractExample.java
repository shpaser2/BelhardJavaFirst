package by.belhard.j18.lessons.lesson7.abstractExample;

public class AbstractExample {
    public static void main(String[] args) {
        AbstractWorker worker = new FactoryWorker("Vasiliy", 25);
        AbstractWorker worker1 = new OfficeWorker("Ignat", 55);

        workingDay(worker);
        System.out.println();
        workingDay(worker1);
    }

    public static void workingDay(AbstractWorker worker){
        worker.work();
        worker.eat("fish");
        worker.work();
    }
}
