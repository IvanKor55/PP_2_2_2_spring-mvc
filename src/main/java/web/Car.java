package web;

import java.util.ArrayList;

public class Car {
    String model;
    String color;
    int power;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }

    public Car (String model, String color, int power) {
        this.model = model;
        this.color = color;
        this.power = power;
    }
    public static ArrayList<Car> listCars () {
        ArrayList<Car> listCars = new ArrayList<>();
        listCars.add(new Car("Model1", "Color1", 1));
        listCars.add(new Car("Model2", "Color2", 2));
        listCars.add(new Car("Model3", "Color3", 3));
        listCars.add(new Car("Model4", "Color4", 4));
        listCars.add(new Car("Model5", "Color5", 5));
        return listCars;
    }
}
