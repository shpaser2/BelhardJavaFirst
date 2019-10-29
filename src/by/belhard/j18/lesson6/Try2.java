package by.belhard.j18.lesson6;

import java.util.Random;

public class Try2 {
    public static void main(String[] args) {
        double random = Math.random();
        System.out.println(random);

        Random randomObject = new Random();
        randomObject.nextInt(32);   //как параметр передаем границу, которую никогда не получим. от 0 до 31
        //когда нужно в диапазоне с не 0 снизу:
        int shift = 10;
        for (int i = 0; i < 5; i++){
            System.out.println(randomObject.nextInt(11) + shift); //random number in [10 .. 20]
        }
    }
}
