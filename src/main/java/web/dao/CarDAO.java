package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota Corolla", 4, 2012));
        cars.add(new Car("Hyundai Solaris", 3, 2015));
        cars.add(new Car("Lada Granta", 2, 2009));
        cars.add(new Car("Kia Rio", 6, 2016));
        cars.add(new Car("Mercedes-Benz GLS", 4, 2021));
    }

    public List<Car> getCars(){
        return cars;
    }
}
