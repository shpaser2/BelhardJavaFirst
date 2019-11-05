package by.belhard.j18.lesson8.exceptionExample.unchecked;

public class Main{
    public static void main(String[] args) {

        System.out.println(getElementByIndex(new String[]{"0", "1", "2"}, 1));
        System.out.println(getField(new ExampleWithField()));

//        System.out.println(getElementByIndex(new String[]{"0", "1", "2"}, 5));
        try {
            System.out.println(getField(null));
        }catch(NullPointerException e){
            System.out.println("We have NPE");
        }finally {
            System.out.println("check done");
        }

    }

    private static Object getField(ExampleWithField o) /*throws NullPointerException - info for developer, not more*/{
        return o.a;
    }

    private static String getElementByIndex(String[] strings, int i)  {
        String string;
        try{
            string = strings[i];
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            //System.exit(0);       //Case to exit without finally.
            return "ERROR";         //This allows execute finally first, only after it this will be showed.
        }finally {
            System.out.println("FINALLY BLOCK");
        }

        return string;
    }


}