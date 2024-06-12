package com.test;

import com.vehicles.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 4);
        Truck truck = new Truck("Ford", "F-150", 1.5);

        car.displayDetails();
        System.out.println();
        truck.displayDetails();       
        
    }
}
