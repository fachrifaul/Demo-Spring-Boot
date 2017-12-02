package com.fachri.DemoSpringBoot;

import com.fachri.DemoSpringBoot.entity.Car;
import com.fachri.DemoSpringBoot.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by fachrifebrian on 12/2/17.
 */
@RestController
@RequestMapping("api/cars/")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @PostMapping("")
    public Car saveCar(@RequestBody Car car) {
        return carRepository.save(car);
    }

    @GetMapping("")
    public Iterable<Car> getAllCars() {
        return carRepository.findAll();
    }

    @GetMapping("{id}/findById")
    public Car findById(@PathVariable(value = "id") String id) {
        return carRepository.findOne(Long.valueOf(id));
    }

    @DeleteMapping("{id}/delete")
    public void deleteById(@PathVariable(value = "id") String id) {
        carRepository.delete(Long.valueOf(id));
    }

    @GetMapping("/findByBrand")
    public List<Car> findByBrand(@RequestParam(value = "brand") String brand){
        return carRepository.findCarByBrand(brand);
    }
}
