package by.belhard.j18.homeworks.homework5.task3;

public class Wardrobe {
    private final int shelvesLimit = 10;
    private Clothes[] shelves = new Clothes[shelvesLimit];

    public void put (Clothes thing, int shelveNumber){
        if(shelveNumber >= shelvesLimit && shelveNumber < 0) {
            System.out.println("wrong shelve number");
            return;
        }
        if (shelves[shelveNumber] == null ){
            shelves[shelveNumber] = thing;
            System.out.printf("Put %s on shelve %d. \n",thing, shelveNumber);
        }else{
            System.out.println("shelve is not empty");
        }
    }

    public void throwThing (Clothes thing){
        boolean result = false;
        for (int i = 0; i < shelvesLimit; i++) {
            if (shelves[i] == null) {
                shelves[i] = thing;
                System.out.printf("Trow %s on shelve with number %d. \n", thing, i);
                result = true;
                break;
            }
        }
        if(!result)
            System.out.println("wardrobe is full");
    }

    public Clothes take (int shelveNumber){
        Clothes result = null;
        if (shelves[shelveNumber] == null ){
            System.out.println("shelve is empty");
        }else{
            result = shelves[shelveNumber];
            shelves[shelveNumber] = null;
        }
        return result;
    }

    public void viewAll(){
        int emptyShelves = 0;
        for (Clothes thing : shelves) {
            if(thing != null){
                System.out.print(thing + " ");
            }else{
                emptyShelves++;
            }
        }
        System.out.printf("There are %d empty shelves in wardrobe. \n", emptyShelves);
    }

}
