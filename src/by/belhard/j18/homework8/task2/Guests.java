package by.belhard.j18.homework8.task2;

import java.util.ArrayList;
import java.util.List;

public class Guests {
    private List<Person> persons = new ArrayList<>();

    public Guests(String... args) {
        for (String name :  args) {
            persons.add(new Person(name));
        }
    }

    public Person findGuest (String name){
        for (int i = 0; i < persons.size(); i++) {
            if(persons.get(i).getName().equals(name))
                return persons.get(i);
        }
        return null;
    }
}
