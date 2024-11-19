package UMLFinals;

public class Jacket extends Apparels {
    private MaterialUsed materialUsed;
    private JacketStyle jacketStyle;

    public Jacket(String size, String color, String brand, Double price, Boolean isAvailable, int stock, JacketStyle jacketStyle, MaterialUsed materialUsed) {
        super(size, color, brand, price, isAvailable, stock);
        this.jacketStyle = jacketStyle;
        this.materialUsed = materialUsed;
    }

    public JacketStyle getJacketStyle() {
        return jacketStyle;
    }

    public void setJacketStyle(JacketStyle jacketStyle) {
        this.jacketStyle = jacketStyle;
    }

    public MaterialUsed getMaterialUsed() {
        return materialUsed;
    }

    public void setMaterialUsed(MaterialUsed materialUsed) {
        this.materialUsed = materialUsed;
    }

    public enum MaterialUsed {
        COTTON,
        GENUINE_LEATHER,
        MICROFIBER;
    }

    public enum JacketStyle {
        HOODIE,
        RIDING_JACKET,
        WINDBREAKER;
    }
    @Override
    public void display() {
        System.out.println("Color: " + this.getColor());
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Size: " + this.getSize());
        System.out.println("Material Used: " + this.materialUsed);
        System.out.println("Style: " + this.jacketStyle);
    }
}
