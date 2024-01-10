package web.service;

import web.model.Car;
import java.util.List;
import static java.lang.Math.min;

public class CarServiseImpl implements CarService{
    @Override
    public List<Car> firstCountlistCars (List<Car> listCars, Integer count) {
        int indexTo = min(count,listCars.size());
        if (indexTo < 0) {
            indexTo = 0;
        }
        return listCars.subList(0,indexTo);
    }
}
