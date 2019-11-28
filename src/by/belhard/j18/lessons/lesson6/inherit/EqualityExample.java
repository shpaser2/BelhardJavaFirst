package by.belhard.j18.lessons.lesson6.inherit;

public class EqualityExample {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", 20, 100);
        Person person2 = new Person("Ivan", 20, 70);

        System.out.println(person1 == person2);
    }
}
