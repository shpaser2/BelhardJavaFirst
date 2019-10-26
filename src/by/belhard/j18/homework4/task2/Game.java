package by.belhard.j18.homework4.task2;

public class Game {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.showDistance();
        player1.printCurrentPosition();
        player1.move(3, 4);
        player1.showDistance();
        player1.printCurrentPosition();
        player1.move(0, 0);
        player1.showDistance();
        player1.printCurrentPosition();

        // by.belhard.j18.homework4.task2.Player@3c09711b if method Object.toString() not Overrided.
        System.out.println(player1.toString()); //same out as in line below
        System.out.println(player1);            //implicit conversion to string

        //(int + int) -> int; int + String -> String First plus - addition, second plus - concatenation. Their priority is equal!
        System.out.println(5 + 11 + " pieces");     //16 pieces
        System.out.println("pieces " + 5 + 11);     //pieces 511
        System.out.println("pieces " + (5 + 11));   //pieces 16 - because parenthesis usage to change priority of execution
    }
}
