package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", 7));
        cars.add(new Car(2, "Mers", 2));
        cars.add(new Car(3, "Opel", 6));
        cars.add(new Car(4, "Mazda", 17));
        cars.add(new Car(5, "Citroen", 3));
    }

    public List<Car> getSomeCar(Integer count){
        if(count==null||count>5){
            return cars;
        }
        else
            return cars.subList(0, count);
    }
}


