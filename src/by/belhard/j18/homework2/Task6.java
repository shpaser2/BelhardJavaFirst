package by.belhard.j18.homework2;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, -5, 6, 7, 8, 9, 10};
        int arraySum = 0;
        double average;
        for (int value : array) {
            arraySum += value;
        }
        average = ((double) arraySum) / 10;
        System.out.println("array sum = " + arraySum);
        System.out.println("average value of array = "
                                + average);
        Arrays.sort(array);
        System.out.println("mediana = " + array[4]);
    }
}
