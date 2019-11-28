package by.belhard.j18.lessons.lesson7.abstractExample;

public class FactoryWorker  extends AbstractWorker{

    public FactoryWorker(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.printf("%s worked hard\n", this.getName());
    }

}
