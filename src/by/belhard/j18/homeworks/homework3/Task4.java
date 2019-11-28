package by.belhard.j18.homeworks.homework3;

public class Task4 {
    /**
     * Calculates actual sum on deposit.
     * proc - year procent
     * index - annual deduction as a percentage of the initial amount
     * years - lifetime of deposit
     */
    public static void main(String[] args) {
        double  proc = 0.12,
                index = 0.01,
                startSum = 5000;
        int years = 15;
        double actualSum = startSum;
        for (int i = 0; i < years; i++) {
            actualSum -= startSum * index;
            actualSum *= 1 + proc;
        }
        System.out.println(actualSum);
    }
}
