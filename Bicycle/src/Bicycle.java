/**
 * Created by mike on 3/20/14.
 */
public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void  changeGear(int newValue) {
        gear = newValue;
    }

    void speedIp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printState() {
        System.out.println("cadence: " + cadence + " speed: " + speed + " gear: " + gear);
    }
}
