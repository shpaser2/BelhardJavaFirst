package by.belhard.j18.lessons.lesson4;

public class Main {
    public static void main(String[] args) {
        Country country1 = new Country("Brasil", 123456);
//        Country country2 = new Country();

        Person person1 = new Person("Alfredo", country1);
        Person person2 = new Person("Tereza", 16, person1.country, Sex.FEMALE);

        System.out.println(country1.title + " zipCode is " + country1.zipCode);

        System.out.println(person1.growOld());
        int terezaOld = person2.growOld();
        System.out.println(terezaOld);

        person1.eat("fish");
        person2.eat("chips");

        Country newCountry = person2.getCountry();
        Country country2 = new Country("Brasil", 123456);
        System.out.println(newCountry == country1); //true
        System.out.println(country2 == country1);   //false

    }
}
