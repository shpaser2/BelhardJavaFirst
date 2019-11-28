package by.belhard.j18.lessons.lesson3;

public class Task3FromHW1 {
    public static void main(String[] args) {
        int radius = 5, circleX = 0, circleY = 0;
        int pointX = 3, pointY = 4;

        /*
        int dX = circleX - pointX;
        int dY = circleY - pointY;

        double distanceSquare = dX * dX + dY * dY;
        int radiusSquare = radius * radius;
        if(distanceSquare < radiusSquare){
            System.out.println("inside");
        }else if(distanceSquare == radiusSquare){
            System.out.println("on");
        }else{
            System.out.println("outside");
        }
        */

        double distanceSquare = Math.sqrt(Math.pow(circleX - pointX, 2) + Math.pow(circleY - pointY, 2));
        if(distanceSquare < radius ){
            System.out.println("inside");
        }else if(distanceSquare == radius){
            System.out.println("on");
        }else{
            System.out.println("outside");
        }

    }
}
