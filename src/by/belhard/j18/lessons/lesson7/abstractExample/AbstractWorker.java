package by.belhard.j18.lessons.lesson7.abstractExample;

public abstract class AbstractWorker {
    private String name;
    private int age;

    public AbstractWorker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(String dish){
        System.out.printf("%s is eating %s\n", name, dish);
    }

    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
