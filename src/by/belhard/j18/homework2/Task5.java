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
            if (number % 5 == 0 && number % 7 != 0
                    || number % 5 != 0 && number % 7 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
        for (int number = 1; number <= 100; number++) {
            if (number < 10
            ||  number > 19 && number < 30
            ||  number > 39 && number < 50
            ||  number > 59 && number < 70
            ||  number > 79 && number < 90
            ||  number > 99)
            {
                 continue;
            }
            if (number % 5 == 0 && number % 7 != 0
            ||  number % 5 != 0 && number % 7 == 0)
            {
                System.out.print(number + " ");
            }
        }
    }
}
