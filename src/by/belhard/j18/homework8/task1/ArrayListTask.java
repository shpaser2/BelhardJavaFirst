package by.belhard.j18.homework8.task1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTask {

    public String filter(ArrayList<String> strings){
        String result = "";
        Iterator<String> iter = strings.iterator();
        while(iter.hasNext()){
            String s = iter.next();
            if(s.length() < 5)
                    result += s + " ";
        }
        return result;
    }
}
