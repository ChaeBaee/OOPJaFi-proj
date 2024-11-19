package UMLFinals;

public class Shorts extends Apparels implements DisplayProduct {
    private ShortsStyle shortsStyle;
    private MaterialUsed materialUsed;;

    public Shorts(String size, String color, String brand, Double price, Boolean isAvailable, int stock, MaterialUsed materialUsed, ShortsStyle shortsStyle) {
        super(size, color, brand, price, isAvailable, stock);
        this.materialUsed = materialUsed;
        this.shortsStyle = shortsStyle;
    }

    public MaterialUsed getMaterialUsed() {
        return materialUsed;
    }

    public void setMaterialUsed(MaterialUsed materialUsed) {
        this.materialUsed = materialUsed;
    }

    public ShortsStyle getShortsStyle() {
        return shortsStyle;
    }

    public void setShortsStyle(ShortsStyle shortsStyle) {
        this.shortsStyle = shortsStyle;
    }

    public enum ShortsStyle {
        SIXPOCKETS,
        JORTS,
        MESH;
    }

    public enum MaterialUsed{
        CANVAS,
        STRETCH_DENIM,
        POLYESTER_MESH;
    }

    @Override
    public void display() {
        System.out.println("Color: " + this.getColor());
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Size: " + this.getSize());
        System.out.println("Material Used: " + this.materialUsed);
        System.out.println("Style: " + this.shortsStyle);
    }
}
