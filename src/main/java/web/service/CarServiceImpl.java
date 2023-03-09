package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Stream;

import static web.model.Car.fiveCars;

public class CarServiceImpl {
    private static List<Car> car = fiveCars();

    public static List<Car> getCountCar(Integer count) {
        Stream<Car> carStream = car.stream()
                .limit(count == null ? Integer.valueOf(car.size()) : count);
        return carStream.toList();
    }
}
