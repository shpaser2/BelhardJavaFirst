package by.belhard.j18.lesson4;

public class PrintfExample {
    public static void main(String[] args) {
        String person = "Света";
        int number = 3;
        System.out.printf("%s мыла %s %d раза", person, "раму", number);
        System.out.println();

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 1 && j == 1)
                    System.out.print("    ");
                else
                    System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

    }
}
