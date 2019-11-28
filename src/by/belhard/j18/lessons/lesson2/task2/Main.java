package by.belhard.j18.lessons.lesson2.task2;

public class Main {
    public static void main(String[] args) {
        Main m1 = new Main();
        Main m2 = new Main();

        System.out.println(m1); //package name class name and hash code of class instance
                                //by.belhard.j18.lessons.lesson2.task2.Main@3b6eb2ec
        System.out.println(m2);
        //25/4 = 6 int/int=int
        //25%4 = 1
        int a = 10;
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
    }
}
