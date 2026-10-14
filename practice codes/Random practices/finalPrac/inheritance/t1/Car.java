public class Car {
    private String brand;
    private int year;
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public String getInfo() {
        return "Brand: " + brand + " | Year: " + year;
    }
}