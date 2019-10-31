package by.belhard.j18.lesson7.interfaceExample;

public interface Workable{
    int defaultAge = 5;

    void work(String param);

    default void defaultMethod(String param){ //дефолтный метод
        System.out.println("param: " + param);
    }

    static void staticMethod(){
        System.out.println("static method");
    }
}
