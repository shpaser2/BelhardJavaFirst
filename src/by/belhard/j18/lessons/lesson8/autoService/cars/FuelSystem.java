package by.belhard.j18.lessons.lesson8.autoService.cars;

import by.belhard.j18.lessons.lesson8.autoService.exceptions.InvalidFuelParameterException;

public class FuelSystem {

    private final FuelType type;
    private final int MAX_VALUE;
    private int currentValue;

    public FuelSystem(FuelType type, int MAX_VALUE, int currentValue) {
        this.type = type;
        this.MAX_VALUE = MAX_VALUE;
        this.currentValue = currentValue;
    }

    public int fillFuel(int newValue) {
        if (newValue <= 0)
            throw new InvalidFuelParameterException("Negative or zero value of fuel");
        if (MAX_VALUE > currentValue + newValue) {
            int rest = newValue - (MAX_VALUE - currentValue);
            currentValue = MAX_VALUE;
            return rest;
        } else {
            currentValue += newValue;
            return 0;
        }
    }

    public void burnFuel(int value) {
        if (value <= 0)
            throw new InvalidFuelParameterException("Negative or zero value of fuel");
        currentValue -= value;
        if (currentValue < 0)
            currentValue = 0;
    }

    public FuelType getType() {
        return type;
    }

    public int getMAX_VALUE() {
        return MAX_VALUE;
    }

    public int getCurrentValue() {
        return currentValue;
    }
}
