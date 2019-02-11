package homework.demo2.dao;

import homework.demo2.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarDao extends JpaRepository<Car, Integer> {
    List<Car> queryCarsByPriceIsGreaterThanEqual(int value);



    List<Car> findFirst10ByOrderByIdDesc();
}
