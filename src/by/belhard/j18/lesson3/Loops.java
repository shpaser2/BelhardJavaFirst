package by.belhard.j18.lesson3;

public class Loops {
    public static void main(String[] args) {
        int[] intArray = {1, 3, 7, -11, 8};

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        for (int i = intArray.length; i > 0; i--) {
            System.out.print(intArray[i - 1] + " ");
        }
        System.out.println('\n');
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println('\n');
//        int[][] arrayD = new int[3][4]; //3 rows, 4 columns
//        int[][] arrayD = new int[3][];  //3 rows, any number of columns, if it will be set in next code
        int[][] arrayD = {{1, 2, 3, 4, 5}, {4, 3}};
        for (int i = 0; i < arrayD.length; i++) {
            for (int j = 0; j < arrayD[i].length; j++) {
                System.out.print(arrayD[i][j] + " ");
            }
            System.out.println();
        }
        //same thing, only by "for each"
        for (int[] ar : arrayD) {
            for (int i : ar) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        //break and continue
        for(int i = 0; i < 99999; i++){
            System.out.print(i + " ");  //prints 0..5
            if(i == 5) break;           //breaks this loop, go to next line after it
        }
        System.out.println();
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0) continue;    //skip operation
            System.out.print(i + " ");  //print odd numbers from zero to ten (1 3 5 7 9)
        }
    }
}
