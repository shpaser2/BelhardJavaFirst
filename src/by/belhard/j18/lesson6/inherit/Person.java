package by.belhard.j18.lesson6.inherit;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //ссылка на один и тот же объект
        if (o == null || getClass() != o.getClass()) return false;  //объект нулевой или у них классы разного типа
        Person person = (Person) o; //если классы объектов одинаковые, приведем оба к одному типу
        return age == person.age && Objects.equals(name, person.name); //сравниваем числа и имена
    }
}
