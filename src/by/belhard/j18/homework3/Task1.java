package by.belhard.j18.homework3;

//What to dress if temperature is known.
public class Task1 {
    public static void main(String[] args) {
        int temperature = 13;
        String answer = "nothing";
        if (temperature < 10) {
            answer = "jacket";
        } else if (temperature < 16) {
            answer = "windbreaker";
        } else if (temperature < 21) {
            answer = "sweater";
        } else if (temperature < 30) {
            answer = "shirt";
        }
        System.out.println(answer);
    }
}
