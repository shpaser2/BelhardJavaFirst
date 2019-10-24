package by.belhard.j18.homework3.task1;

public class Building {
    private boolean     houseElevator;
    BuildingMaterial    material;
    BuildingType        usageType;
    int                 stages; //floor
    int                 year;
    Address             address;

    public Building(boolean houseElevator, BuildingMaterial material, BuildingType usageType, int stages, int year, Address address) {
        this.houseElevator = houseElevator;
        this.material = material;
        this.usageType = usageType;
        this.stages = stages;
        this.year = year;
        this.address = address;
    }
}
