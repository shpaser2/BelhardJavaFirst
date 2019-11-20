package by.belhard.j18.homework8.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayListTask example = new ArrayListTask();
        ArrayList<String> al_strings = new ArrayList<>();
        String[] strings = new String[] {"aaa", "bbb", "qwerty", "", ".","abcde","ccc"};
        for (String s : strings) al_strings.add(s);

        System.out.println(example.filter(al_strings));
    }
}
