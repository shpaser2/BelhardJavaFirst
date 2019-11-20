package by.belhard.j18.homework9.task3a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.DoubleBinaryOperator;
//
public class Main {

    private static final DoubleBinaryOperator plus = (a, b) -> a + b;
    private static final DoubleBinaryOperator minus = (a, b) -> a - b;
    private static final DoubleBinaryOperator division = (a, b) -> a / b;
    private static final DoubleBinaryOperator multiply = (a, b) -> a * b;

    public static void main(String[] args) {

        try (BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in))) {

            String input = rdr.readLine();
            do {
                try {
                    System.out.println(calcWithParse(input));
                } catch (Exception e) {
                    System.err.println("something goes wrong...");
                }

                input = rdr.readLine();
            } while (!"exit".equals(input));

        } catch (IOException e) {
            System.err.println("Wrong input");
        }

    }

    private static double calcWithParse(String input) {

        input = input.replaceAll("\\s*", "");

        DoubleBinaryOperator operation;
        String operator = input.replaceAll("[\\d.]*", "");

        switch (operator) {
            case "+":
                operation = plus;
                break;
            case "-":
                operation = minus;
                break;
            case "/":
                operation = division;
                break;
            case "*":
                operation = multiply;
                break;
            default:
                throw new RuntimeException(input);
        }

        String[] split = input.split("[" + operator + "]");

        return operation.applyAsDouble(
                Double.parseDouble(split[0]),
                Double.parseDouble(split[1])
        );
    }
}
