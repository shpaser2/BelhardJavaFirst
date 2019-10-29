package by.belhard.j18.homework5.task1;

public class Main {
    public static void main(String[] args) {
        Table[] tablesCatalog = {
                new Table(4, 50, TableMaterial.STEEL, TableShape.SQUARE, 100),
                new Table(1, 80, TableMaterial.GLASS, TableShape.ROUND, 90),
                new Table()};
        for (Table table : tablesCatalog) {
            System.out.print(table);
        }
    }
}
