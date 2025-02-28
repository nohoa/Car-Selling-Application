package dev.car.carsell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/carsell")
public class CarsellController {

    @Autowired
    private CarsellService carsellService;

    @GetMapping
    public ResponseEntity<List<Car>> allCar(){
        return new ResponseEntity<List<Car>>(carsellService.getAllCar(), HttpStatus.OK);
    }
}
