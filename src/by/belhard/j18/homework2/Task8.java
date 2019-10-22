package by.belhard.j18.homework2;

public class Task8 {
    public static void main(String[] args) {
        int[][] array2D = new int[4][];
        array2D[0] = new int[1];
        array2D[1] = new int[2];
        array2D[2] = new int[3];
        array2D[3] = new int[4];
        int startInt = 1;
//        for (int[] array : array2D) {
//            for (int value : array) {
//                value = startInt;
//                startInt *= 2;
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }
        //not just another variant! Foreach works with copies and do not changes the array.
        for (int i = 0; i < array2D.length; i++)
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = startInt;
                startInt *= 2;
            }
        //prints out array in normal way
        for (int[] arr : array2D ) {
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
        //additional task
        for (int i = 0; i < array2D.length; i++)
            for (int j = array2D[i].length - 1; j >= 0; j--) {
                System.out.print(array2D[i][j] + " ");
                if (j == 0)
                    System.out.println();
            }
    }

}
