package by.belhard.j18.lesson8.autoService.cars;

import by.belhard.j18.lesson8.autoService.exceptions.InvalidFuelParameterException;

public abstract class Car{

    private String title;

    private WheelType wheels;
    private boolean wheelsOkState;

    private FuelSystem fuelSystem;

    public Car(String title, WheelType wheels, boolean wheelsOkState, FuelSystem fuelSystem) {
        this.title = title;
        this.wheels = wheels;
        this.wheelsOkState = wheelsOkState;
        this.fuelSystem = fuelSystem;
    }

    public String getTitle() {
        return title;
    }

    public WheelType getWheels() {
        return wheels;
    }

    public int fillFuel(int newValue){
        return fuelSystem.fillFuel(newValue);
    }

    public void destroyWheels(){
        this.wheelsOkState = false;
    }

    public void burnFuel(int value){
        try {
            this.fuelSystem.burnFuel(value);
        }catch (InvalidFuelParameterException e){
            System.out.println(e.getMessage());
        }

    }
}
