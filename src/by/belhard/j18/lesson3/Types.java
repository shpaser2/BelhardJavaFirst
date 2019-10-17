package by.belhard.j18.lesson3;

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

    }
}
