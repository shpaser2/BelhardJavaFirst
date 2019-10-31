package by.belhard.j18.lesson7;

public class hashExample {
    public static void main(String[] args) {
        Object object = new Object();
        System.out.println(object);

        int hash = object.hashCode();
        System.out.println(hash);
        System.out.println(Integer.toHexString(hash));
    }
}
