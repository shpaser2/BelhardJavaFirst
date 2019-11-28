package by.belhard.j18.homeworks.homework5.task3;

public class Clothes {
    private String name;        //title

    public Clothes(String name) {
        this.name = name;
    }

    public Clothes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
