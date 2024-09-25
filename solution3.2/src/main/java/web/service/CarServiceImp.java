package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImp implements CarService {

    @Override
    public int getNumberOfCars(List<Car> cars) {
        return cars.size();
    }


}

