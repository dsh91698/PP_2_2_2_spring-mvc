package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import model.Car;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    private CarService carService;
    static List<Car> cars = new ArrayList<>();
    static {
        cars.add(new Car("Blackbird", "Kia", 2023));
        cars.add(new Car("Kolibri", "Nissan", 2022));
        cars.add(new Car("Bullrider", "BMW", 2021));
        cars.add(new Car("Pontecorvo", "Cadillac", 2020));
        cars.add(new Car("Chupacabra", "Jeep", 2019));
//        cars.add(new Car("Barbaris", "Toyota", 2017));
    }

    public CarsController(CarService carService) {
        this.carService = carService;
    }

//    public CarsController() {}

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> carsForShow = carService.selectCars(cars, count);
        model.addAttribute("cars", carsForShow);
        return "cars";
    }
}