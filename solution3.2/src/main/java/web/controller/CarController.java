package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

//    дополнительно сделала метод для удобства, который возвращает список мишин,

    public List<Car> getCars() {
        Car car1 = new Car("Aventador", "Lamborghini", 2017);
        Car car2 = new Car("Corvette", "Chevrolet", 2023);
        Car car3 = new Car("Veyron", "Bugatti", 2016);
        Car car4 = new Car("Mustang", "Ford", 2020);
        Car car5 = new Car("Artura", "McLaren", 2021);
        return new ArrayList<>(List.of(car1, car2, car3, car4, car5));
    }


    @GetMapping(value = "/cars")
    public String showCarlist(ModelMap model, @RequestParam(required = false, defaultValue = "5") Integer count) {
        if (count < 5) {
            List<Car> cars2 = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                cars2.add(getCars().get(i));
            }
            model.addAttribute("cars", cars2);
        } else {
            model.addAttribute("cars", getCars());
        }
        return "cars";
    }

}

