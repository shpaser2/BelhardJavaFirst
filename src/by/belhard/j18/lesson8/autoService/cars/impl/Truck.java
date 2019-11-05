package by.belhard.j18.lesson8.autoService.cars.impl;

import by.belhard.j18.lesson8.autoService.cars.Car;
import by.belhard.j18.lesson8.autoService.cars.FuelSystem;
import by.belhard.j18.lesson8.autoService.cars.WheelType;

public class Truck extends Car {
    public Truck(String title, boolean wheelsOkState, FuelSystem fuelSystem) {
        super(title, WheelType.BIG, wheelsOkState, fuelSystem);
    }
}
