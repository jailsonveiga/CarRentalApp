package com.careerdevs;

public class Car {
    private String make;
    private String model;
    private boolean isRented; // we can use isRented = false;

    // public Car(String make, String model, boolean isRented){}
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
                                // this.isRented = isRented;
        this.isRented = false; // Alternative way isRented = false;
    }

    public String getMake() {
        return make; // Return the value
    }

    public String getModel() {
        return model; // Return the value
    }

    // Create a method to Concatenate make and model
    public String getName() {
        return make + " " + model;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}
