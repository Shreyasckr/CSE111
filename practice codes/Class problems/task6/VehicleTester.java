public class VehicleTester{
    public static void main (String args[]){
        Vehicle v1 = new Vehicle();
        v1.x = 0;
        v1.y = 0;
        System.out.println(v1.details());
        System.out.println("============");
        v1.moveUp();
        System.out.println(v1.details());
        System.out.println("============");
        v1.moveLeft();
        v1.moveDown();
        System.out.println(v1.details());
        System.out.println("============");
        v1.moveRight();
        System.out.println(v1.details());
        System.out.println("============");
    }
}
