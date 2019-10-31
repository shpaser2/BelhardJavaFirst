package by.belhard.j18.lesson7;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();

        listOfStrings.add("lalala2");
        listOfStrings.add(0,"lalala1");
        String get = listOfStrings.get(1);  //lalala2
        System.out.println(listOfStrings.size());   //number of cells with smth

        Map <Character, Integer> charMap = new HashMap<>(); //<> - diamond operator. Before 8 java
                                                            // types must be repeated in right part.
        charMap.put('c', 1);
        System.out.println(charMap.get('c'));
        charMap.put('c', 1);
        System.out.println(charMap.get('c'));

    }
}
