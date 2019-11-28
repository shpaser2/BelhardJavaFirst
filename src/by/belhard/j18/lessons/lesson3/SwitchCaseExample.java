package by.belhard.j18.lessons.lesson3;

public class SwitchCaseExample {
    public static void main(String[] args) {
        //switch case operator
        String day = "Mondey";
        String result;

        switch (day){
            case "Mondey":
                result = "Too long";
                break;
            case "Tuesday":
                result = "a bit closer";
                break;
            case "Wednesday":
                result = "middle week";
                break;
            case "Thusday":
                result = "close enough";
                break;
            case "Friday":
                result = "at last";
                break;
            case "Saturday":
            case "Sunday":
                result = "WEEKEND!!";
                break;
            default:
                result = "not day of week";
                break;
        }
        System.out.println(result);
    }
}
