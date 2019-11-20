package by.belhard.j18.homework8.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Guests guests = new Guests("Ivan", "Nikolai", "Olga", "Vladimir", "Oleg");

        Person greetedGuest = guests.findGuest("Ivan");

        System.out.println(greetedGuest.toString());

    }
}
