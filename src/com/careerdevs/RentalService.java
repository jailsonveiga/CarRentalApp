package com.careerdevs;

public class RentalService {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Car Rental App");

        // Traditional / Standard Array
        // Create list/array
        Car[] carStorage = new Car[3]; // [3] How many Elements(length) inside the Car Array

        // Create Obj Instance
        Car car1 = new Car("Honda", "Accord");
        Car car2 = new Car("Chevy", "Cruze");
        Car car3 = new Car("Toyota", "Carolla");

        // Store Obj Instance in list/array
        carStorage[0] = car1;
        carStorage[1] = car2;
        carStorage[2] = car3;

        car2.setRented(true);

        // Solution Standard Array
        // Iterate through the array, only display cars where isRented is false
       System.out.println("Available Cars:");
       int listNumber = 1;
        for(int i = 0; i < carStorage.length; i++) {
            if(!carStorage[i].isRented()){
                System.out.println( "(" + listNumber + ") " + carStorage[i].getName());
                listNumber++;
            }
        }
    }
}
