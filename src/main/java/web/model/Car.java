package web.model;

import java.util.ArrayList;

public class Car {
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    private String model;
    private String color;
    private int power;

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
}
