package by.belhard.j18.lessons.lesson4;

public class Country {
    String title;
    int zipCode;

    public Country(String title, int zipCode){
        this.title = title.toUpperCase();
        this.zipCode = zipCode;
    }

    public Country(){
        title = "NOLAND";
        zipCode = 111111;
    }
}
