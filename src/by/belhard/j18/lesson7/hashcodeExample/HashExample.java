package by.belhard.j18.lesson7.hashcodeExample;

public class HashExample {
    public static void main(String[] args) {
        Object object = new Object();
        System.out.println(object);

        int hash = object.hashCode();
        System.out.println(hash);
        System.out.println(Integer.toHexString(hash));
    }
}
