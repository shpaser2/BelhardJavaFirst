package by.belhard.j18.lesson3;

public class Task2FromHW1 {
    public static void main(String[] args) {
        int r = 5;
        double pi = 3.14;

        if(r <= 0){
            System.out.println("error");
        }else{
            System.out.println("length: " + r * pi * 2);
            System.out.println("square: " + Math.pow(r, 2) * Math.PI);
        }
    }
}
