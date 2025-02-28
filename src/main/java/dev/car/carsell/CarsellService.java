package dev.car.carsell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsellService {

    @Autowired
    private CarsellRepository carsellRepository;

    public List<Car> getAllCar() {
        return carsellRepository.findAll();
    }
}
