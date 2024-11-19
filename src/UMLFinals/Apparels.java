package UMLFinals;

public abstract class Apparels implements DisplayProduct{
    private String size;
    private String color;
    private String brand;
    private Double price;
    private Boolean isAvailable;
    private int stock;

    public Apparels(String size, String color, String brand, Double price, Boolean isAvailable, int stock) {
        this.size = size;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.isAvailable = isAvailable;
        this.stock = stock;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean reduceStock(int quantity) {
        if (quantity > this.stock) {
            System.out.println("Not enough stock available!");
            return false;
        }
        this.stock = this.stock - quantity;
        return true;
    }

    public void inventoryStock(){

    }
    @Override
    public void display(){

    }

}
