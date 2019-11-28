package by.belhard.j18.lessons.lesson6.classObject;

//Тема: методы класса Object, рефлексия.
public class ClazzExample {
    public static void main(String[] args) {
        ClazzExample clazzExample = new ClazzExample();
        Class<? extends ClazzExample> clazz = clazzExample.getClass();



    }
}
