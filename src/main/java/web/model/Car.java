package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String name;
    private String country;
    private int cost;

    public Car(String name, String country, int cost) {
        this.name = name;
        this.country = country;
        this.cost = cost;
    }

    public static List<Car> fiveCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", "Russia", 1000));
        cars.add(new Car("BMW", "Germany", 2000));
        cars.add(new Car("Mersedes", "Germany", 3000));
        cars.add(new Car("Toyota", "Japan", 4000));
        cars.add(new Car("Nissan", "USA", 5000));

        return cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}
