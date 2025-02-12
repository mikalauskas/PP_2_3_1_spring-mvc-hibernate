package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car("bmw", "black", "auto"));
        cars.add(new Car("mers", "green", "auto"));
        cars.add(new Car("lada", "white", "manual"));
        cars.add(new Car("kamaz", "red", "manual"));
        cars.add(new Car("volga", "silver", "manual"));
    }

    public List<Car> getCars(int count) {
        if (count > -1 && count < cars.size()) {
            return cars.subList(0, count);
        }
        return cars;
    }
}
