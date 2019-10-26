package by.belhard.j18.homework2.task1;

public class Main {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println(b & 32767);
        short sh = 32000;
        System.out.println(b | sh);
        System.out.println(b & sh);
        char c = 'a' + 1;  //char is always above zero!
        System.out.println(c);
        System.out.println(c + 1);
        int i = 12;
        long k = 9223372036854775806L;   // from -9223372036854775808 to 9223372036854775807
        System.out.println(k + k);
        float f = 0.1F;
        System.out.println(i / f);
        f = 1e1f;
        System.out.println(i / f);
        double d = 12345.6;
        System.out.println(d > f);
        boolean bool = false;
        System.out.println((f > i) != bool);
    }
}
