package service;

import model.Car;

import java.util.List;

public interface CarService {
    List<Car> selectCars(List<Car> carList, int carQuantity);
}
