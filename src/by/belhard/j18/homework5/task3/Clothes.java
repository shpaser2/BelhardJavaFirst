package by.belhard.j18.homework5.task3;

public class Clothes {
    private String name;

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
