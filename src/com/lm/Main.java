package com.lm;

public class Main {

    public static void main(String[] args) {
        // Created by Laura Macia: April 2018
        // Udemy Complete Java Masterclass with Tim Buchalka
        // Answer to Challenge: Inheritance

        // Challenge.
        // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the Car class.
        // You should be able to hand steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviours (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For you specific type of vehicle you will want to add something specific for that type of car.



        HondaFit silver = new HondaFit("Silver", 2012);

        System.out.println("New Honda Fit is color " + silver.getColor());
        System.out.println("Current gear is " + silver.getCurrentGear());

        silver.changeGearManual(1);
        System.out.println("New gear after adding one is " + silver.getCurrentGear());

        System.out.println("Initial speed is " + silver.getCurrentSpeed());
        silver.changeSpeed(25);

        silver.accelerate(30);

    }
}
