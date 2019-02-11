package homework.demo2.service.impl;

import homework.demo2.dao.CarDao;
import homework.demo2.models.Car;
import homework.demo2.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarDao carDao;
    @Override
    public void save(Car car) {
        carDao.save(car);

    }

    @Override
    public List<Car> findAll() {
        return carDao.findAll();
    }

    @Override
    public Optional<Car> findById(int id) {
        return carDao.findById(id);
    }

    @Override
    public void delete(int id) {
        carDao.deleteById(id);

    }
}
