package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Blackbird", "Kia", 2023));
        cars.add(new Car("Kolibri", "Nissan", 2022));
        cars.add(new Car("Bullrider", "BMW", 2021));
        cars.add(new Car("Pontecorvo", "Cadillac", 2020));
        cars.add(new Car("Chupacabra", "Jeep", 2019));
    }

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model) {
        model.addAttribute("cars", cars);
        return "cars";
    }

}