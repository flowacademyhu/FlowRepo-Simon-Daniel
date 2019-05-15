package carsharing.service;

import carsharing.domain.Car;
import carsharing.domain.Reservation;
import carsharing.repository.CarRepository;
import carsharing.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CarService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    ReservationRepository reservationRepository;

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public void delete(String id) throws Exception {
        for (int i = 0; i < reservationRepository.findAll().size(); i++) {
            Reservation chosenResevation = reservationRepository.findAll().get(i);
            if (chosenResevation.getCar().getPlateNumber() == id) {
                throw new Exception();
            }
            carRepository.deleteById(id);
        }

    }

    public List<Car> listCars() {
        return carRepository.findAll();
    }

    public Car getCarById(String id) {
        return carRepository.findById(id).get();
    }

    public List<Car> listCarsbyBrand(String brand) {

        return carRepository.findByBrand(brand);
    }

    public List<Car> listCarsbyType(String type) {

        return carRepository.findByType(type);
    }

}
