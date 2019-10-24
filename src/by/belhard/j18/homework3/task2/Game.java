package by.belhard.j18.homework3.task2;

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
    }
}
