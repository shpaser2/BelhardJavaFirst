package by.belhard.j18.lesson3;

public class Arrays {
    public static void main(String[] args) {
        int[] array1 = {5, 6, 8, -10, 11};

        //System.out.println(array1[5]);    //array index out of bounds
        System.out.println(array1[3]);

        array1[0] = 100;
        System.out.println(array1[0]);

        int[] array2 = new int[3];
        System.out.println(array2[0]);

        int[][] arrayD = new int[3][];
//        System.out.println(arrayD[0]);  //null cause new int[3][];
//        int[][] arrayD2 = new int[3][2];
//        System.out.println(arrayD2[0]); //[I@3b6eb2ec
//        System.out.println(arrayD2[0][1]); //0
        arrayD[0] = new int[3];
        arrayD[1] = new int[2];
        arrayD[2] = new int[4];
        System.out.println(arrayD[0]);  //[I@3b6eb2ec : [ means that it is array, I - integer, and next - hashcode of this object
        arrayD[0] = new int[]{15, 10, 2};
        arrayD[1][0] = 5;
        System.out.println(arrayD[1][0]);   //5
        arrayD[1][1] = -55;

        int[] arrayInner = arrayD[1];   //changes with 1000 arrayD[1][0] = 5; by copy of link on place in memory
        arrayInner[0] = 1000;
        System.out.println(arrayD[1][0]);  //1000


    }
}
