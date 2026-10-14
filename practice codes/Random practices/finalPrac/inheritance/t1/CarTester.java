public class CarTester {
    public static void main(String[] args) {
        ElectricCar e1 = new ElectricCar("Tesla", 2022, 400);
        ElectricCar e2 = new ElectricCar("Rivian", 2023);
        System.out.println(e1.getInfo());
        System.out.println("Range: " + e1.range + " km");
        System.out.println("---");
        System.out.println(e2.getInfo());
        System.out.println("Range: " + e2.range + " km");
    }
}

//Brand: Tesla | Year: 2022
//Range: 400 km
//---
//Brand: Rivian | Year: 2023
//Range: 300 km