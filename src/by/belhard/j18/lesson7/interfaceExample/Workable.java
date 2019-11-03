package by.belhard.j18.lesson7.interfaceExample;

public interface Workable {

    int defaultAge = 5;

    void work();

    default void defaultMethod(String param) {
        System.out.println("param: " + param /*+ makeString(param)*/);
    }

    static void staticMethod() {
        System.out.println("staticMethod");
    }

//    private String makeString(String lower) {
//        return lower.toUpperCase();
//    }
}
