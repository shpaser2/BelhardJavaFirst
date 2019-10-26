package by.belhard.j18.homework5.task1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Table {
    private int legs;
    private int height;
    private TableMaterial material;
    private TableShape shape;
    private int price;

    public Table(int legs, int height, TableMaterial material, TableShape shape, int price) {
        this.legs = legs;
        this.height = height;
        this.material = material;
        this.shape = shape;
        this.price = price;
    }

    public Table() {
        this.legs = 4;
        this.height = 85;
        this.material = TableMaterial.WOOD;
        this.shape = TableShape.RECTANGULAR ;
        this.price = 40;
    }

    @Override
    public String toString() {
        return "Table with" + legs + "legs, " + height + " sm height. " +
                "Material: " + material + ". Shape: " + shape +
                ". Price: " + price + ".\n";
    }


}
