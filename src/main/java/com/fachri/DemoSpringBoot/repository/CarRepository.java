package com.fachri.DemoSpringBoot.repository;

import com.fachri.DemoSpringBoot.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by fachrifebrian on 12/2/17.
 */
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findCarByBrand(String brand);
}
