package Vehicles;

//Basic exercise to try abstrakt class

public class Main {
    public static void main(String[] args) {
        Car car = new Car(0);
        car.displayInfo();
        System.out.println(car.getSpeed());
    }
}
