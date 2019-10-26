package by.belhard.j18.homework4.task1;

public class Task1 {
    public static void main(String[] args) {
        Building building1 = new Building(true, BuildingMaterial.BRICK,
                BuildingType.HABITABLE, 10, 1969, new Address("Cosmo", 23));
        System.out.println(building1.address.house);
    }
}
