package by.belhard.j18.homework1.task3;

public class Main {
    public static void main(String[] args) {
        double  rad = 10.0,
                rX = 0.0,
                rY = 0.0;
        double  dX = 10.1,
                dY = 11.2;
        double radiusToPoint = Math.sqrt(Math.abs(dX-rX)*Math.abs(dX-rX) + Math.abs(dY - rY)*Math.abs(dY - rY));
        if(radiusToPoint < rad){
            System.out.println("Внутри");
        }else if(radiusToPoint == rad){
            System.out.println("На окружности");
        }else{
            System.out.println("За пределами");
        }
    }
}
