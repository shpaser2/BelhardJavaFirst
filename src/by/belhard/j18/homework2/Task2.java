package by.belhard.j18.homework2;


//import by.belhard.j18.lesson3.Arrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int salaryFirst = 800,
                salarySecond = 1200,
                salaryThird = 1050;
        int maxSalary = salaryFirst,
                minSalary = salaryFirst;

        //variant 1
/*
        if(salarySecond < minSalary) {
            minSalary = salarySecond;
        }
        if(salaryThird < minSalary) {
            minSalary = salaryThird;
        }

        if(salarySecond > maxSalary) {
            maxSalary = salarySecond;
        }
        if(salaryThird > maxSalary) {
            maxSalary = salaryThird;
        }
  */

        int[] arr = {salaryFirst, salarySecond, salaryThird};
        //variant 2
        /*
        for (int a : arr) {
            if (a < minSalary)
                minSalary = a;
            if (a > maxSalary)
                maxSalary = a;
        }
*/
        //variant 3
        Arrays.sort(arr);
        minSalary = arr[0];
        maxSalary = arr[arr.length - 1];

        //variant 4
/*
        if (salaryFirst > salarySecond) {
            if (salaryFirst > salaryThird) {
                maxSalary = salaryFirst;
            } else {
                maxSalary = salaryThird;
            }
        } else {
            if (salarySecond > salaryThird) {
                maxSalary = salarySecond;
            } else {
                maxSalary = salaryThird;
            }
        }

        if (salaryFirst < salarySecond) {
            if (salaryFirst < salaryThird) {
                minSalary = salaryFirst;
            } else {
                minSalary = salaryThird;
            }
        } else {
            if (salarySecond < salaryThird) {
                minSalary = salarySecond;
            } else {
                minSalary = salaryThird;
            }
        }
*/
        int difference = maxSalary - minSalary;
        System.out.println(difference);
    }
}
