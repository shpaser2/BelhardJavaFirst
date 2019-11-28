package by.belhard.j18.homeworks.homework8.task2;

public class Main {
    public static void main(String[] args) {

        Guests guests = new Guests("Ivan", "Nikolai", "Olga", "Vladimir", "Oleg");

        Person greetedGuest = guests.findGuest("Ivan");

        System.out.println(greetedGuest.toString());

    }
}
