package com.lm;

public class HondaFit extends Car {

    private String color;
    private int year;

    public HondaFit(String color, int year) {
        super(2600, 161, 67, "Honda Fit", 4, 5, 5);
        this.color = color;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
