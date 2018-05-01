package com.lm;

public class Vehicle {

    private String name;
    private int weight;
    private int length;
    private int width;

    private int currentSpeed;
    private int currentDirection;


    public Vehicle(String name, int weight, int length, int width) {
        this.name = name;
        this.weight = weight;
        this.length = length;
        this.width = width;

        this.currentDirection = 0;
        this.currentSpeed = 0;
    }

    public void changeDirection (int directionChange) {
        this.currentDirection += directionChange;
        System.out.println("New direction is " + this.getCurrentDirection());
    }

    public void move(int speed, int direction) {
        // Here we directly change speed and direction, rather than varying based on before
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("Vehicle.move(). Vehicle moves at " + currentSpeed + " speed and " + " direction");
    }

    public void changeSpeed (int speedChange) {
        this.currentSpeed += speedChange;
        System.out.println("New speed is " + this.getCurrentSpeed());
    }

    public void stop() {
        this.currentSpeed = 0;
    }

    //GETTERS:
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
