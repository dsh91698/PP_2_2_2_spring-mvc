package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{

    static List<Car> carList = new ArrayList<>();
    static {
        carList.add(new Car("Blackbird", "Kia", 2023));
        carList.add(new Car("Kolibri", "Nissan", 2022));
        carList.add(new Car("Bullrider", "BMW", 2021));
        carList.add(new Car("Pontecorvo", "Cadillac", 2020));
        carList.add(new Car("Chupacabra", "Jeep", 2019));
//        cars.add(new Car("Barbaris", "Toyota", 2017));
    }


    @Override
    public List<Car> selectCars(int carQuantity) {
        carQuantity = carQuantity >= 5 ? carList.size()  : carQuantity;
        List<Car> carsForShow = carList.subList(0, carQuantity);
        return carsForShow;
    }
}