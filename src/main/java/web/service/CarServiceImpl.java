package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService{

    @Override
    public List<Car> selectCars(List<Car> carList, int carQuantity) {
        carQuantity = carQuantity >= 5 ? carList.size()  : carQuantity;
        List<Car> carsForShow = carList.subList(0, carQuantity);
        return carsForShow;
    }
}