package by.belhard.j18.homeworks.homework5.task3;

public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe();
        wardrobe.viewAll();
        wardrobe.throwThing(new Clothes("shirt"));
        wardrobe.throwThing(new Clothes("jacket"));
        wardrobe.put(new Clothes("trousers"), 2);
        wardrobe.viewAll();
        wardrobe.take(2);
        wardrobe.viewAll();
    }
}
