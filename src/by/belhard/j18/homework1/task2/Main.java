package by.belhard.j18.homework1.task2;

import java.util.Scanner;

//Delayed in this task. I like it. Thank you for task.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Введите радиус целым числом");
            String radius = input.nextLine();
            if(radius.equals("exit")) {break;}
            try {
                int r = Integer.parseInt(radius);
                if(r <= 0){
                    System.out.println("Некорректный ввод!");
                    continue;
                }
                System.out.println("Периметр окружности равен: " + 2*Math.PI*r);
                System.out.println("Площадь окружности равна: " + Math.PI*r*r);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод!");
            }
        }
    }
}
