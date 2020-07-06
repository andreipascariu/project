package ro.project.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.project.project.models.Car;
import ro.project.project.repositories.CarRepository;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;
    
    
    public boolean addCar(String carName){
        Car car = new Car();
        car.setCarName(carName);
        carRepository.save(car);
        return true;
    }
    
}
