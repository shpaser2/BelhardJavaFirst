package by.belhard.j18.lesson10.regexp;


public class RegexpExample {
    public static void main(String[] args) {

        String input = "6ds5a3fs2adfasef123123vgsd";
        //заменить все цифры на звездочку
        //[\\d] - селектор, + или ? или * после этого - квантификатор
        String output = input.replaceAll("[\\d]", "*");

        System.out.println(input);
        System.out.println(output);

        //^ - begin of expression
        //$ - end of expression
        //() - block of symbols
        //.+ - any symbol any quantity of times
        input.matches("^(.+)@(.+)$");
    }
}
