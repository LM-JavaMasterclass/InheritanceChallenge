package com.lm;

public class Car extends Vehicle {

    private String name;
    private int wheels;
    private int doors;
    private int gears;

    private int currentGear;

    public Car(int weight, int length, int width, String name1, int wheels, int doors, int gears) {
        super("Car", weight, length, width);
        this.name = name1;
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;

        this.currentGear = 0;
    }

        public void changeGearManual (int change){
        if (((currentGear+change)<gears)&&((currentGear+change)>=-1)) {
            currentGear += change;
            System.out.println("New current gear is " + currentGear);
        } else {
            System.out.println("Invalid change of gears. Current gear still " + currentGear);
        }
    }

    public void accelerate (int rate) {
        int newVelocity = getCurrentSpeed() + rate;
        if (newVelocity <=0) {
            stop();
            changeGearManual(1);
        } else if (newVelocity >0 && newVelocity <=10) {
            changeGearManual(1);
        } else if (newVelocity >10 && newVelocity <=20) {
            changeGearManual(2);
        } else if (newVelocity >20 && newVelocity <=30) {
            changeGearManual(3);
        } else {
            changeGearManual(4);
        }

        if (newVelocity > 0) {
            changeSpeed(rate);
            move(newVelocity, getCurrentDirection());
        }

    }


    @Override
    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
