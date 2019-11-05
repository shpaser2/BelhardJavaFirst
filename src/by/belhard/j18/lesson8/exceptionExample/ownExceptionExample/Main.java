package by.belhard.j18.lesson8.exceptionExample.ownExceptionExample;

import java.security.InvalidParameterException;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(perimeter(5, 3));
            System.out.println(perimeter(5, -3));
        }catch(MyOwnInvalidParameterException e){
            System.err.println(e.getMessage());
        }
    }

    private static int perimeter(int a, int b) throws MyOwnInvalidParameterException{

        if (a <= 0 || b <= 0) {
            throw new MyOwnInvalidParameterException(a, b);
        }
        int result = (a + b) * 2;
        return result;
    }


}
