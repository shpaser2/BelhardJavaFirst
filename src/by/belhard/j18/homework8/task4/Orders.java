package by.belhard.j18.homework8.task4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Orders {
    private Map<String, Map<String, Integer>> orders = new HashMap<>();

    public void addOrder(String customer, Map<String, Integer> order){
        orders.put(customer, order);
    }

    public void showFoodstuff(){
        HashMap<String, Integer> foodStuff = new HashMap<>();

        for (Map<String, Integer> order : orders.values() ) {
            for (Map.Entry foodItem : order.entrySet() ) {
                if(! foodStuff.containsKey(foodItem.getKey())){
                    foodStuff.put((String)foodItem.getKey(), (Integer)foodItem.getValue());
                }else{
                    foodStuff.replace(  (String)foodItem.getKey(),
                                        foodStuff.get((String)foodItem.getKey()) + (Integer)foodItem.getValue() );
                }
            }
        }

        for (Map.Entry item : foodStuff.entrySet() ) {
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }



}
