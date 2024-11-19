package UMLFinals;

public class Pants extends Apparels implements DisplayProduct {
    private MaterialUsed materialUsed;
    private PantsStyle pantsStyle;

    public Pants(String size, String color, String brand, Double price, Boolean isAvailable, int stock,
                 MaterialUsed materialUsed, PantsStyle pantsStyle) {
        super(size, color, brand, price, isAvailable, stock);
        this.materialUsed = materialUsed;
        this.pantsStyle = pantsStyle;
    }

    public MaterialUsed getMaterialUsed() {
        return materialUsed;
    }

    public void setMaterialUsed(MaterialUsed materialUsed) {
        this.materialUsed = materialUsed;
    }

    public PantsStyle getPantsStyle() {
        return pantsStyle;
    }

    public void setPantsStyle(PantsStyle pantsStyle) {
        this.pantsStyle = pantsStyle;
    }

    public enum PantsStyle {
        STRAIGHT_CUT,
        CARGO_PANTS,
        CORDUROY_PANTS;
    }

    public enum MaterialUsed {
        DENIM,
        CORDUROY,
        RIPSTOP_FABRIC;
    }

    @Override
    public void display() {
        System.out.println("Color: " + this.getColor());
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Size: " + this.getSize());
        System.out.println("Material Used: " + this.materialUsed);
        System.out.println("Style: " + this.pantsStyle);
    }
}
