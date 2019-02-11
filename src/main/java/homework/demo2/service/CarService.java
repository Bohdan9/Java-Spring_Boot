package homework.demo2.service;

import homework.demo2.models.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    void save (Car car);

    List<Car> findAll();






    Optional<Car> findById(int id);

    void delete(int id);


}
