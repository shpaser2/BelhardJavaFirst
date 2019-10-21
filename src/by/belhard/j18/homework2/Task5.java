package by.belhard.j18.homework2;

public class Task5{
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            if (number % 3 == 0 && number % 7 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
        for (int number = 1; number <= 100; number++) {
            if ((number % 5 == 0) ^ (number % 7 == 0)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
        for (int number = 1; number <= 100; number++) {
            if ((number / 10 % 2 != 0)
            && ((number % 5 == 0) ^ (number % 7 == 0)))
            {
                System.out.print(number + " ");
            }
        }
    }
}
