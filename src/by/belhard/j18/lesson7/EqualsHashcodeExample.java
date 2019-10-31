package by.belhard.j18.lesson7;

public class EqualsHashcodeExample {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Ivan");
        Person person2 = new Person(2, "Vasiliy");
        Person person3 = new Person(1, "Ivan");

        System.out.println("person1: " + person1.hashCode());
        System.out.println("person2: " + person2.hashCode());
        System.out.println("person3: " + person3.hashCode());

        System.out.println();
        System.out.println(person1.hashCode() == person2.hashCode());
        System.out.println(person2.hashCode() == person3.hashCode());
        System.out.println(person1.hashCode() == person3.hashCode());

    }
}
