package by.belhard.j18.lesson2.task3;

public class Main {
    public static void main(String[] args) {
        int a = 20;
        if (a < 20) {
            System.out.println(a);
        } else if(a >= 20 && a < 60){
            System.out.println(a * 2);
        } else {
            System.out.println("higher than 60");
        }
    }
}
