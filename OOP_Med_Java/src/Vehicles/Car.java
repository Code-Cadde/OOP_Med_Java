package Vehicles;

public class Car extends Vehicle {
    private int speed;

    public Car(int speed) {
        this.speed = 100;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public void displayInfo(){
        System.out.println("Detta är en bil och den kör snabbts! DAKAREN VROOOM!");
    }
    
    
}
