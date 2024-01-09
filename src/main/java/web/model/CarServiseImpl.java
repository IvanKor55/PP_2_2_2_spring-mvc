package web.model;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.min;

public class CarServiseImpl {
    public static List<Car> firstCountlistCars (List<Car> listCars, Integer count) {
        return listCars.subList(0,min(count,listCars.size()));
    }
}
