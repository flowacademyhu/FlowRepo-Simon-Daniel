package carsharing.service;

import carsharing.domain.Car;
import carsharing.domain.Driver;
import carsharing.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public Driver save(Driver driver) {
        return driverRepository.save(driver);
    }

    public void delete(String id) {
        driverRepository.deleteById(id);
    }

    public List<Driver> listDrivers() {
        return driverRepository.findAll();
    }

    public Driver getDriverById(String id) {
        return driverRepository.findById(id).get();
    }
}
