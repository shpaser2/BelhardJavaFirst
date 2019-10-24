package by.belhard.j18.homework3.task2;

@SuppressWarnings("all")    //ignore all "yellow" warnings

public class Player {
    private double x, y;
    private double distance;

    public Player(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Player() {
        this(0, 0);
    }

    public void move(double newX, double newY){
        distance += calcDistance(newX, newY);
        this.x = newX;
        this.y = newY;
    }

    public void printCurrentPosition(){
        System.out.printf("position: [%.2f : %.2f]\n", this.x, this.y);
    }

    //private тут - пример сокращения кода, абстракции функциональности
    private double calcDistance(double x, double y){
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public void showDistance(){
        System.out.printf("distance: %.2f \n", distance);
    }


    @Override
    public String toString() {
        return String.format("position: [%.2f : %.2f]; distance: %.2f\n", this.x, this.y, distance);
    }

    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        if(distance < 0)
            System.out.println("distance set error");
        else
            this.distance = distance;
    }
}
