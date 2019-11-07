package by.belhard.j18.lesson8.exceptionExample.ownExceptionExample;

public class MyOwnInvalidParameterException extends Exception {
    public MyOwnInvalidParameterException(int i1, int i2) {
        super(prepareMethod(i1, i2));
    }

    private static String prepareMethod(int i1, int i2){

        return String.format("Invalid parameters: %d, %d", i1, i2);
    }
}
