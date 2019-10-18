package by.belhard.j18.homework2;

public class Task2 {
    public static void main(String[] args) {
        int salaryFirst = 800,
            salarySecond = 1200,
            salaryThird = 1050;
        int maxSalary,
            minSalary;

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

        int difference = maxSalary - minSalary;
        System.out.println(difference);
    }
}
