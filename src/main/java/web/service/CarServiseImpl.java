package web.service;

import web.Main;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.min;

public class CarServiseImpl implements CarService{
    private List<Car> listCars = Main.listCars;
    @Override
    public List<String> getlistCars (Integer count) {
        List<String> stringList = new ArrayList<>();
        if (count == null || count <= 0) {
            stringList.add("A request was entered for an empty list");
        } else {
            for (int i = 0; i < count && i < 5; i++) {
                stringList.add(listCars.get(i).toString());
            }
        }
        return stringList;
    }
}
