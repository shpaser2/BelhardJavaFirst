package by.belhard.j18.lessons.lesson3;

public class Types {
    public static void main(String[] args) {
        int a = 97;
        char c = (char) a;
        System.out.println(c);  //a, char inside
        System.out.println(c - 26);  //71, int inside
        System.out.println((char) (c - 26));  //G, char inside
        System.out.println((int) '\n');  //shows number of the symbol
        System.out.print("f");
        System.out.print("f");
        System.out.print("f"); //fff in one line

        String result;
        /*
        if(a >= 97){
            result = "small letter";
        }else{
            result = "big letter";
        }
        System.out.println(result);
        */
        //same as next
        result = a >= 97 ? "small letter" : "big letter";
        System.out.println(result);

        result =    (a >= 97 && a<=123 ) ? "small letter" :
                    (a >= 97 && a<=123 ) ? "big letter" : "not english alphabet letter";
        System.out.println(result);
//        next code not compiles and not works
//                (a >= 97 && a<=123 ) ? "small letter" :
//                (a >= 97 && a<=123 ) ? "big letter" : "not english alphabet letter";



    }
}
