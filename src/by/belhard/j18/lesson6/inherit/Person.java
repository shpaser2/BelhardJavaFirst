package by.belhard.j18.lesson6.inherit;

public class Person {
    private String name;
    private int age;
    private double weight;

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Person(String name, int age) {
        this(name, age, 65);
    }

    public int growOld(){
        return ++age;
    }

    public void eat(String dish){
        System.out.printf("%s is eating %s\n", name, dish);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
