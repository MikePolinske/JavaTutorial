/**
 * Created by mike on 3/20/14.
 */
public class BicycleDemo {
    public static void main(String[] args) {

        // Create two different Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // Invoke methods on those objects
        bike1.changeCadence(50);
        bike1.speedIp(10);
        bike1.changeGear(2);
        bike1.printState();

        bike2.changeCadence(50);
        bike2.speedIp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedIp(10);
        bike2.changeGear(3);
        bike2.printState();
    }
}
