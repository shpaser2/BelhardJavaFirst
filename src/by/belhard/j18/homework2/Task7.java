package by.belhard.j18.homework2;

public class Task7 {
    //This shows multiplication table.
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++) {
                int result = i * j;
                if (result > 1) {
                    System.out.print(result + "\t");
                } else {
                    System.out.print("\t");
                }
                if (j == 9)
                    System.out.println();
            }
    }
}
