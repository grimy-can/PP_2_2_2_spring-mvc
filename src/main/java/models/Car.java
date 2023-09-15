package models;

public class Car {

    private final String model;
    private final String color;
    private final int year;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car " + "model " + model + ", color " + color + ", year " + year;
    }
}
