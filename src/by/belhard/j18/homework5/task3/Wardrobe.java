package by.belhard.j18.homework5.task3;

public class Wardrobe {
    private final int shelvesLimit = 10;
    private Clothes[] shelves = new Clothes[shelvesLimit];

    public void put (Clothes thing, int shelveNumber){
        if(shelveNumber < shelvesLimit) {
            if (shelves[shelveNumber] == null ){
                shelves[shelveNumber] = thing;
            }else{
                System.out.println("shelve is not empty");
            }
        }else{
            System.out.println("wrong shelve number");
        }
    }

    public void throwThing (Clothes thing){
        boolean result = false;
        for (int i = 0; i < shelvesLimit; i++) {
            if (shelves[i] == null) {
                shelves[i] = thing;
                result = true;
                break;
            }
        }
        if(!result)
            System.out.println("wardrobe is full");
    }

    public Clothes take (int shelveNumber){
        Clothes thing = new Clothes();
        if (shelves[shelveNumber] == null ){
            System.out.println("shelve is not empty");
        }else{
            thing = shelves[shelveNumber];
        }
        return thing;
    }

    public void viewAll(){
        int emptyShelves = 0;
        for (Clothes thing : shelves) {
            if(thing != null){
                System.out.println(thing.toString());
            }else{
                emptyShelves++;
            }
        }
        System.out.printf("There are %d empty shelves in wardrobe. \n", emptyShelves);
    }

}
