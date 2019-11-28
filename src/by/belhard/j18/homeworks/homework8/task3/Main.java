package by.belhard.j18.homeworks.homework8.task3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String stringToParse = "!Мама? мыла, раму.";
        System.out.println(parseString(stringToParse).toString());
    }

    public static Map<Character, Integer> parseString(String s){
        char[] chars = s.toCharArray();
        Map<Character, Integer> cFrequency = new HashMap<>();
        for (char c : chars) {
            Character C = new Character(c);
            if(cFrequency.containsKey(C)){
                cFrequency.replace(C, cFrequency.get(C) + 1);
            }else{
                cFrequency.put(C, 1);
            }
        }
        return cFrequency;
    }
}
