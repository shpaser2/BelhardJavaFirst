package by.belhard.j18.homework8.task4;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static Object Map;

    public static void main(String[] args) {

        Orders orders = new Orders();
        Map<String, Integer> order = Stream.of(new Object[][] {
                { "bread", 1 },
                { "butter", 2 },
        }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
        orders.addOrder("Ivan", order);
        order = Stream.of(new Object[][] {
                { "milk", 3 },
                { "cheese", 2 },
                {"bread", 2},
        }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
        orders.addOrder("Oleg", order);
        order = Stream.of(new Object[][] {
                { "milk", 1 },
                { "butter", 2 },
                { "egg", 2},
        }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
        orders.addOrder("Kate", order);

        orders.showFoodstuff();
    }
}
