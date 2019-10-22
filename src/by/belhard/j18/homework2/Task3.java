package by.belhard.j18.homework2;

public class Task3 {
    public static void main(String[] args) {
        int a = -2, n = 10;
        int result = a;
        if (n == 0) {
            result = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                if (i > 1)
                    result *= a;
            }
        }
        System.out.println(result);
    }
}
