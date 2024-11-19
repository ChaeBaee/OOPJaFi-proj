package UMLFinals;

public class Shirt extends Apparels implements DisplayProduct {

    private MaterialUsed materialUsed;
    private ShirtStyle shirtStyle;

    public Shirt(String size, String color, String brand, Double price, Boolean isAvailable, int stock,
                 MaterialUsed materialUsed, ShirtStyle shirtStyle) {
        super(size, color, brand, price, isAvailable, stock);
        this.materialUsed = materialUsed;
        this.shirtStyle = shirtStyle;
    }

    public MaterialUsed getMaterialUsed() {
        return materialUsed;
    }

    public void setMaterialUsed(MaterialUsed materialUsed) {
        this.materialUsed = materialUsed;
    }

    public ShirtStyle getShirtStyle() {
        return shirtStyle;
    }

    public void setShirtStyle(ShirtStyle shirtStyle) {
        this.shirtStyle = shirtStyle;
    }

    // Enums for material and style
    public enum MaterialUsed {
        COTTON,
        LINEN,
        POLYESTER;
    }

    public enum ShirtStyle {
        SLIMFIT,
        REGULARFIT,
        RELAXEDFIT;
    }

    @Override
    public void display() {
        System.out.println("Color: " + this.getColor());
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Size: " + this.getSize());
        System.out.println("Material Used: " + this.materialUsed);
        System.out.println("Style: " + this.shirtStyle);
    }
}
