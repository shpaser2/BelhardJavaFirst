package by.belhard.j18.lessons.lesson7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsExample {
    public static void main(String[] args) {

        List<String> listOfStrings = new ArrayList<>();

        listOfStrings.add("lalala2");
        listOfStrings.add(0, "lalala1");
        String get = listOfStrings.get(1);

        System.out.println(listOfStrings.size());

        Map<Character, Integer> charMap = new HashMap<>();

        charMap.put('c', 1);
        System.out.println(charMap.get('c'));
        charMap.put('c', 5);
        System.out.println(charMap.get('c'));

    }
}
