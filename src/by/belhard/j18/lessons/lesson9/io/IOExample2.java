package by.belhard.j18.lessons.lesson9.io;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class IOExample2 {

    private static final Map<String, Map<String, Integer>> requests = new HashMap<>();

    public static void main(String[] args) {

        try (BufferedReader fReader = new BufferedReader(new FileReader("testInput.ti"));
             BufferedWriter fWriter = new BufferedWriter(new FileWriter("testOutput.to"))
        ) {

            String[] splitted;

            while (fReader.ready()) {
                splitted = fReader.readLine().split(" ");

                String name = splitted[0];
                String first = splitted[1];
                int firstCount = Integer.parseInt(splitted[2]);
                String second = splitted[3];
                int secondCount = Integer.parseInt(splitted[4]);

                Map<String, Integer> map = new HashMap<>();
                map.put(first, firstCount);
                map.put(second, secondCount);

                requests.put(name, map);

                fWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Scanner sc = new Scanner();

        requests.forEach((name, map) -> {
            System.out.println(name);
            map.forEach(
                    (product, quantity) -> System.out.printf("\t%s : %d\n", product, quantity)
            );
        });
    }
}
