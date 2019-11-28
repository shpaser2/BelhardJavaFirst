package by.belhard.j18.lessons.lesson8.autoService.cars.impl;


import by.belhard.j18.lessons.lesson8.autoService.cars.Car;
import by.belhard.j18.lessons.lesson8.autoService.cars.FuelSystem;
import by.belhard.j18.lessons.lesson8.autoService.cars.FuelType;
import by.belhard.j18.lessons.lesson8.autoService.cars.WheelType;

import java.util.Arrays;
import java.util.List;

public class Sedan extends Car {

    private static final List<FuelType> possibleFuelTypes = Arrays.asList(FuelType.AI92, FuelType.AI98);

    public Sedan(String title, boolean wheelsOkState, FuelSystem fuelSystem) {
        super(title, WheelType.SMALL, wheelsOkState, checkFuel(fuelSystem, possibleFuelTypes));
    }
}
