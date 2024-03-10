package Övningkörning_med_oop;

public class Car implements Vehicle {
    boolean isRunning;
    int currentSpeed;

     @Override
    public void start() {
        isRunning = true;
        System.out.println("The car has started.");
    }

    @Override
    public void accelerate(int speed) {
        if (isRunning) {
            currentSpeed += speed;
            System.out.println("The car is accelerating. Current speed: " + currentSpeed + " km/h");
        } else {
            System.out.println("The car is not running. Start the car first.");
        }
    }

    @Override
    public void brake() {
        if (currentSpeed > 0) {
            currentSpeed -= 10;
            System.out.println("The car is slowing down. Current speed: " + currentSpeed + " km/h");
        } else {
            System.out.println("The car is already stationary.");
        }
    }

    @Override
    public void stop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("The car has stopped.");
    }
    
    
}
